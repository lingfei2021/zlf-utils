package com.zlf.utils.redis.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.concurrent.TimeUnit;

@Data
@AllArgsConstructor
@Component
public class RedisHandler {

    private final StringRedisTemplate stringRedisTemplate;
    private final RedisTemplate redisTemplate;

    public RedisTemplate getRedisTemplate(){
        return redisTemplate;
    }

    public void keys(String pattern){
        Set keys = stringRedisTemplate.keys(pattern);
        System.out.println(keys);
    }

    public StringRedisTemplate getStringRedisTemplate(){
        return this.stringRedisTemplate;
    }

    public void test() {
        String key = "my:test:redis:key";

        if(!stringRedisTemplate.hasKey(key)){
            stringRedisTemplate.opsForValue().set(key, "1", 31, TimeUnit.DAYS);
        }

        Long increment = stringRedisTemplate.opsForValue().increment(key);

        System.out.println(increment);
    }

    public void delete(String pattern){
        Set<String> keys = stringRedisTemplate.keys(pattern);
        keys.stream().forEach(key -> {
            stringRedisTemplate.delete(key);
        });
    }
}
