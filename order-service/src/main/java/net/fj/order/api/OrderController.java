package net.fj.order.api;

import net.fj.commons.vo.OrderVo;
import net.fj.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * wfw Project
 * net.fj.order
 * 2017-12-28-13:02
 * 2017fj
 * Created by fannyfang on 2017-12-28.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired DiscoveryClient discoveryClient;

    @PostMapping("/addOrder")
    public Boolean addOrder(@RequestBody OrderVo orderVo){
        orderService.save(orderVo);
        return true;
    }
}

