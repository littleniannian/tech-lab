package com.jarvis.techlab.redis.dao;

import com.jarvis.techlab.redis.entity.cache.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName e UserCacheDao.java
 * @createTime 2021年11月03日 16:00:00
 */
@Repository
public class UserCacheDao {
    private static final String KEY_PATTERN = "user:%s";

    private final RedisTemplate<String,Object> template;

    public UserCacheDao(RedisTemplate<String,Object> template) {
        this.template = template;
    }

    private static String buildKey(Long id){
        return String.format(KEY_PATTERN,id);
    }

    public User get(Long id) {
        String key = buildKey(id);
        Object value = template.opsForValue().get(key);
        return (User) value;
    }

    public void set(User user){
        String key = buildKey(user.getId());
        template.opsForValue().set(key,user);
    }


}
