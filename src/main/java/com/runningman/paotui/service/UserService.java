package com.runningman.paotui.service;

import com.runningman.paotui.pojo.User;

public interface UserService {

    User getUser(String username);

    void addUser(User user);

    boolean checkUser(User user);
<<<<<<< HEAD
=======

    int getUserAuth(String username);
>>>>>>> upstream/master
}
