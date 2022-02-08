package com.zlf.utils.springboot.scheduled;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 使用@Async注解实现异步任务
 * 这种方式比较简单，在定时任务上加上@Async注解，注意：需启动类配合加上 @EnableAsync才会生效
 * 默认线程池大小为100
 * 每5s执行一次，不会等待上次结束
 */

@Component
@Log4j2
public class AsyncScheduledTask {
    @Async
    @Scheduled(cron = "0/5 * * * * ?")
    public void task1() throws InterruptedException {
        log.info("I am Async task11111111, current thread: {}", Thread.currentThread());
        while (true) {
            //模拟耗时任务，阻塞10s
            Thread.sleep(10000);
            break;
        }
    }

    @Async
    @Scheduled(cron = "0/5 * * * * ?")
    public void task2() {
        log.info("I am Async task22222222, current thread: {}", Thread.currentThread());
    }
}
