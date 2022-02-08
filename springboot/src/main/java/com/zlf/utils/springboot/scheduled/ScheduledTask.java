package com.zlf.utils.springboot.scheduled;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 加上 ScheduledConfig 配置后，会由指定的线程池来执行；
 * 且每个任务执行都会等待上一个任务结束；
 *
 * 不加 ScheduledConfig 配置时：则是由单线程来执行，多个定时任务时会阻塞执行；
 */
@Component
@Log4j2
public class ScheduledTask {

    @Scheduled(cron = "0/5 * * * * ?")
    public void task1() throws InterruptedException {
        log.info("I am task11111111, current thread: {}", Thread.currentThread());
        while (true) {
            //模拟耗时任务，阻塞10s
            Thread.sleep(10000);
            break;
        }
    }

    @Scheduled(cron = "0/5 * * * * ?")
    public void task2() {
        log.info("I am task22222222, current thread: {}", Thread.currentThread());
    }
}
