package net.fj.order.repository;

import net.fj.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * wfw Project
 * net.fj.order.repository
 * 2018-01-02-13:43
 * 2018fj
 * Created by fannyfang on 2018-01-02.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

}
