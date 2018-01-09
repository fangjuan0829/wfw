package net.fj.order.repository;

import net.fj.order.model.OrderCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * wfw Project
 * net.fj.order.repository
 * 2018-01-03-13:47
 * 2018fj
 * Created by fannyfang on 2018-01-03.
 */
@Repository
public interface OrderCategoryRepository extends JpaRepository<OrderCategory,Long> {

}
