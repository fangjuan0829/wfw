package net.fj.wfw.service;

import net.fj.carouselservice.model.Carousel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * wfw Project
 * net.fj.wfw.service
 * 2018-01-03-9:19
 * 2018fj
 * Created by fannyfang on 2018-01-03.
 */
@FeignClient("carousel-service")
public interface CarouselService {

    @GetMapping("/carousels/getCarousels/{usedFor}") List<Carousel> getCarousels(@PathVariable("usedFor") String usedFor);
}
