package net.fj.carouselservice.service;

import net.fj.carouselservice.model.Carousel;

import java.util.List;

/**
 * wfw Project
 * net.fj.carouselservice.service
 * 2017-12-28-15:51
 * 2017fj
 * Created by fannyfang on 2017-12-28.
 */

/**
 * @Author:fannyfang
 * @Description:轮播服务接口
 * @Date:15:52 2017-12-28
 */
public interface CarouselService {

    List<Carousel> findByUsedFor(String usedFor);

    Carousel findOne(Long id);

    Carousel save(Carousel carousel);

    void delete(Long id);

}
