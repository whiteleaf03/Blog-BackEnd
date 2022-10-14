package cn.whiteleaf03.blogbackend.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;


@SuppressWarnings(value = {"unchecked", "rawtypes"})
@Component
public class RedisCache {

    private final RedisTemplate redisTemplate;

    @Autowired
    public RedisCache(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public <T> void setObject(final String key, final T value) {
        redisTemplate.opsForValue().set(key, value);
    }
}
