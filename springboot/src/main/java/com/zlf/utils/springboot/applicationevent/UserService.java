package com.zlf.utils.springboot.applicationevent;

/**
 * @Author: zlf
 * @Date: 2021/4/12 8:48 下午
 */
public interface UserService {

    User addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);

}
