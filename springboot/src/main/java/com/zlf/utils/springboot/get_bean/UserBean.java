package com.zlf.utils.springboot.get_bean;

import com.zlf.utils.springboot.applicationevent.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: zlf
 * @Date: 2021/4/12 8:32 下午
 */

@Data
@Builder
@Component
@AllArgsConstructor
public class UserBean {

    public User getUser(){
        return User.builder()
                .name("tom")
                .age(18)
                .address("english")
                .build();
    }
}
