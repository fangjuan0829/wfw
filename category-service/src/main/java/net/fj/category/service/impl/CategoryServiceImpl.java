package net.fj.category.service.impl;

import net.fj.category.model.Category;
import net.fj.commons.api.ResourceNotFoundException;
import net.fj.category.repository.CategoryRepository;
import net.fj.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * wfw Project
 * net.fj.goods.service.impl
 * 2017-12-28-14:57
 * 2017fj
 * Created by fannyfang on 2017-12-28.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository goodRepository;

    @Override
    public Category findOne(Long id) {
        Category category = goodRepository.findOne(id);
        if (category == null)
            throw new ResourceNotFoundException(id);
        return category;
    }

    @Override
    public List<Category> findByLevelAndName(Integer level, String name) {
        return goodRepository.findByLevelAndName(level, name);
    }

    @Override
    public Category save(Category category) {
        return goodRepository.save(category);
    }
}
