package net.fj.wfw.controller;

import net.fj.commons.vo.OrderVo;
import net.fj.wfw.domain.Result;
import net.fj.wfw.service.OrderService;
import net.fj.wfw.utils.ResultUtil;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

/**
 * wfw Project
 * net.fj.consumer
 * 2018-01-02-19:06
 * 2018fj
 * Created by fannyfang on 2018-01-02.
 */
@RestController
@RequestMapping("/order")
public class OrderController{

    @Autowired OrderService orderService;

    @PostMapping("/addOrder")
    public Result addOrder(OrderVo orderVo,Model model, HttpSession session) {
        Map modelMap = model.asMap();
//        Long userId= (Long) modelMap.get("userId");
        //TODO session中获取 user_id 问题待处理
        orderVo.setUserId(2L);
        orderService.addOrder(orderVo);

        return ResultUtil.success();
    }

}
