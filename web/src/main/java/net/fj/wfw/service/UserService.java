package net.fj.wfw.service;

import net.fj.user.model.User;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * wfw Project
 * net.fj.wfw.service
 * 2018-01-02-19:23
 * 2018fj
 * Created by fannyfang on 2018-01-02.
 */
@FeignClient("user-service")
public interface UserService {

    @PostMapping("/user/login")
    User login(@RequestBody User user);

    @PostMapping("user/insertUser") Boolean register(@RequestBody User user);
}
