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

    public void keys(String pattern){
        Set keys = stringRedisTemplate.keys(pattern);
        System.out.println(keys);
    }

    public void test() {
        String key = "my:test:redis:key";

        if(!stringRedisTemplate.hasKey(key)){
            stringRedisTemplate.opsForValue().set(key, "1", 31, TimeUnit.DAYS);
        }

        Long increment = stringRedisTemplate.opsForValue().increment(key);

        System.out.println(increment);
    }
}
