package com.zlfprogram.springboot.applicationevent;

/**
 * @Author: zhanglingfei
 * @Date: 2021/4/12 8:48 下午
 */
public interface UserService {

    User addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);

}
