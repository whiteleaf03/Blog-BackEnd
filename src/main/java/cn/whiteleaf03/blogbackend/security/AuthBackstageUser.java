package cn.whiteleaf03.blogbackend.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author WhiteLeaf03
 * 用户类，封装用户信息和权限信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthBackstageUser implements UserDetails, Serializable {

    private BackstageUser backendUser;

    /**
     * 返回权限信息
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    /**
     * 返回用户id
     */
    public Long getId() {
        return backendUser.getId();
    }

    /**
     * 返回用户名
     */
    @Override
    public String getUsername() {
        return backendUser.getUsername();
    }

    /**
     * 返回密码
     */
    @Override
    public String getPassword() {
        return backendUser.getPassword();
    }

    /**
     * 用户是否没过期
     * true 未过期
     * false 已过期
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 账号是否被锁定
     * true没锁定
     * false被锁定
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 是否过期
     * true没过期
     * false过期
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 账号是否启用
     * true启动
     * false禁用
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}
