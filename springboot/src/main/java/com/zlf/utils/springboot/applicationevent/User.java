package com.zlf.utils.springboot.applicationevent;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: zlf
 * @Date: 2021/4/12 8:32 下午
 */

@Data
@Builder
public class User {

    private String name;
    private Integer age;
    private String address;

}
