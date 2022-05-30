package com.zlf.utils.redis.redisson;

import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class RedissonTest {
    @Autowired
    private RedissonClient redissonClient;

    public void lock() {

        RLock rLock = redissonClient.getLock("redisson:test:lock");
        log.info("进入了方法");
        boolean b = rLock.tryLock();
        if(!b){
            log.info("获锁失败");
            return;
        }

        try {
            log.info("获锁成功");
            Thread.sleep(60000);

        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        } finally {
            // 释放锁
            rLock.unlock();
            log.info("释放了锁");
        }
    }
}
