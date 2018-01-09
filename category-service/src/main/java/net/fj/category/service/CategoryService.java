package net.fj.category.service;



import net.fj.category.model.Category;

import java.util.List;

/**
 * wfw Project
 * net.fj.goods.service
 * 2017-12-28-14:56
 * 2017fj
 * Created by fannyfang on 2017-12-28.
 */
public interface CategoryService {
    Category findOne(Long id);

    List<Category> findByLevelAndName(Integer level, String name);

    Category save(Category category);
}
