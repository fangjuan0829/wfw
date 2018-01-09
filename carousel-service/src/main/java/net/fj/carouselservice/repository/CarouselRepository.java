package net.fj.carouselservice.repository;

import net.fj.carouselservice.model.Carousel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * wfw Project
 * net.fj.carouselservice.repository
 * 2017-12-28-15:50
 * 2017fj
 * Created by fannyfang on 2017-12-28.
 */

/**
 * @Author:fannyfang
 * @Description:轮播服务数据访问
 * @Date:15:51 2017-12-28
 */

@Repository
public interface CarouselRepository extends JpaRepository<Carousel,Long> {

    List<Carousel> findByUsedFor(String usedFor);

    Carousel save(Carousel carousel);

}
