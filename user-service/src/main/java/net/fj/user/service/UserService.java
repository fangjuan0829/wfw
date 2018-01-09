package net.fj.user.service;

import net.fj.user.model.User;

/**
 * wfw Project
 * net.fj.user.service
 * 2017-12-29-13:11
 * 2017fj
 * Created by fannyfang on 2017-12-29.
 */
public interface UserService {
    User findByName(String name);

    User save(User user);
}
