package com.zlfprogram.springboot.applicationevent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author: zhanglingfei
 * @Date: 2021/4/12 8:57 下午
 */
@Component
@Slf4j
public class UserActionEventListener {

    @Async("lazyTraceExecutor")
    @EventListener(value = UserActionEvent.class, condition = "#event.operate.name()=='ADD'")
    public void addUserActionEvent(UserActionEvent event){
        User user = event.getUser();
        log.info("监听到新增用户：{}", user);

        log.info("处理后续事宜。。。。。");
    }
}
