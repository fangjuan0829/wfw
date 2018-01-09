package net.fj.carouselservice.service.impl;

/**
 * wfw Project
 * net.fj.carouselservice.service.impl
 * 2017-12-28-15:52
 * 2017fj
 * Created by fannyfang on 2017-12-28.
 */

import net.fj.carouselservice.model.Carousel;
import net.fj.carouselservice.repository.CarouselRepository;
import net.fj.carouselservice.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:fannyfang
 * @Description:轮播服务Spring Data JPA实现
 * @Date:15:53 2017-12-28
 */
@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselRepository carouselRepository;

    @Override
    public List<Carousel> findByUsedFor(String usedFor) {
        return carouselRepository.findByUsedFor(usedFor);
    }

    @Override
    public Carousel findOne(Long id) {
        return carouselRepository.findOne(id);
    }

    @Override
    public Carousel save(Carousel carousel) {
        return carouselRepository.save(carousel);
    }

    @Override
    public void delete(Long id) {
        carouselRepository.delete(id);
    }
}
