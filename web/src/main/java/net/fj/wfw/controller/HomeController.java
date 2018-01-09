package net.fj.wfw.controller;

import net.fj.carouselservice.model.Carousel;
import net.fj.category.model.Category;
import net.fj.wfw.service.CarouselService;
import net.fj.wfw.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * wfw Project
 * net.fj.wfw.controller
 * 2017-12-28-15:16
 * 2017fj
 * Created by fannyfang on 2017-12-28.
 */
@Controller
@RequestMapping("/")
public class HomeController{

    @Autowired CarouselService carouselService;

    @Autowired CategoryService categoryService;


    @RequestMapping(method = RequestMethod.GET)
    public String home(Map<String, Object> model,HttpSession session) {
        Category category = categoryService.getCategory(1L);
        List<Carousel> carousels = carouselService.getCarousels("home");
        // 楼层
        model.put("category", category);
        model.put("carousels", carousels);
        // 楼层
        String username = (String) session.getAttribute("userName");
        return "home";
    }

    @GetMapping("{url}")
    public String url(@PathVariable String url){
        return url;
    }

}
