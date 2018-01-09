package net.fj.user.repository;

import net.fj.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * wfw Project
 * net.fj.user.repository
 * 2017-12-29-13:09
 * 2017fj
 * Created by fannyfang on 2017-12-29.
 */
public interface UserRepository extends JpaRepository<User,Long>{
    User findByName(String name);


}
