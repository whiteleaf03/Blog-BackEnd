package cn.whiteleaf03.blogbackend.config;

import cn.whiteleaf03.blogbackend.utils.FastJsonRedisSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author WhiteLeaf03
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {

        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);

        FastJsonRedisSerializer fastJsonRedisSerializer = new FastJsonRedisSerializer(Object.class);
        template.setDefaultSerializer(fastJsonRedisSerializer);

        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(fastJsonRedisSerializer);

        template.afterPropertiesSet();
        return template;
    }

}