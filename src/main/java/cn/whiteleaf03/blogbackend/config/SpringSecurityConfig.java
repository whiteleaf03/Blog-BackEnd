package cn.whiteleaf03.blogbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author WhiteLeaf03
 * SpringSecurity配置类
 */
@Configuration
public class SpringSecurityConfig {

    /**
     * 密码加密方式
     * 创建BCryptPasswordEncoder并将其注入容器
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    /**
     * 配置放行
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        //关闭csrf
        http
                .csrf().disable();
        //不通过Session获取SecurityContext
        http
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/bs/api/login").permitAll()
                .antMatchers("/fd/api/*").permitAll()
                .anyRequest().authenticated();

        return http.build();
    }
}
