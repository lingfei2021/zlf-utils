package com.zlfprogram.springboot.applicationevent;

import lombok.Getter;

import java.io.Serializable;

/**
 * @Author: zhanglingfei
 * @Date: 2021/4/12 8:40 下午
 */

@Getter
public enum UserOperateEnum implements Serializable {
    ADD("add", 0, "新增"),
    UPDATE("update", 1, "修改"),
    DELETE("delete", 2, "删除");

    private String name;
    private Integer value;
    private String desc;

    UserOperateEnum(String name, Integer value, String desc) {
        this.name = name;
        this.value = value;
        this.desc = desc;
    }
}
