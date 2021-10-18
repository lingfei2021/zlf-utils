package com.zlf.utils.springboot.applicationevent;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * @Author: zlf
 * @Date: 2021/4/12 8:37 下午
 */
@Getter
@Setter
@ToString
public class UserActionEvent extends ApplicationEvent {

    private Boolean success;
    private UserOperateEnum operate;
    private User user;

    public UserActionEvent(Object source) {
        super(source);
    }
}
