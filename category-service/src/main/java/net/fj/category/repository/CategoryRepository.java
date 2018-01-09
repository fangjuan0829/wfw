package net.fj.category.repository;

import net.fj.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * wfw Project
 * net.fj.goods.repository
 * 2017-12-28-14:43
 * 2017fj
 * Created by fannyfang on 2017-12-28.
 */

/**
 * @Author:fannyfang
 * @Description:分类 仓库
 * @Date:14:44 2017-12-28
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String name);

    //    List<Category> findByParentId(Long parentId);
    //
    //    List<Category> findByLevel(Integer level);

    List<Category> findByLevelAndName(Integer level, String name);
}
