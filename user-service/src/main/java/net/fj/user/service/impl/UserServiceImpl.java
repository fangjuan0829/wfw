package net.fj.user.service.impl;

import net.fj.user.model.User;
import net.fj.user.repository.UserRepository;
import net.fj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * wfw Project
 * net.fj.user.service.impl
 * 2017-12-29-13:12
 * 2017fj
 * Created by fannyfang on 2017-12-29.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override public User save(User user) {
        return userRepository.save(user);
    }
}
