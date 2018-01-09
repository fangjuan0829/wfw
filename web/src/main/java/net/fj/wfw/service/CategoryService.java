package net.fj.wfw.service;

import net.fj.category.model.Category;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * wfw Project
 * net.fj.wfw.service
 * 2018-01-02-19:53
 * 2018fj
 * Created by fannyfang on 2018-01-02.
 */
@FeignClient("category-service")
public interface CategoryService {

    @GetMapping("/category/{id}")
    public Category getCategory(@PathVariable("id") Long id);

}
