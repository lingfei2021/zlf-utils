package com.zlf.utils.springboot.applicationevent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @Author: zlf
 * @Date: 2021/4/12 8:50 下午
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public User addUser(User user) {
        log.info("add 数据库持久化成功！！");

        UserActionEvent event = new UserActionEvent(this);
        event.setSuccess(true);
        event.setOperate(UserOperateEnum.ADD);
        event.setUser(user);

        applicationEventPublisher.publishEvent(event);
        log.info("发布add事件:{}", event);

        return user;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }
}
