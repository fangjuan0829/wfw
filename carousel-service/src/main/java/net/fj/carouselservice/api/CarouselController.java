package net.fj.carouselservice.api;
import net.fj.carouselservice.model.Carousel;
import net.fj.carouselservice.service.CarouselService;
import net.fj.commons.api.Error;
import net.fj.commons.api.ResourceNotFoundException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
/**
 * wfw Project
 * net.fj.carouselservice.api
 * 2017-12-28-15:54
 * 2017fj
 * Created by fannyfang on 2017-12-28.
 */

/**
 * @Author:fannyfang
 * @Description:轮播服务API
 * @Date:15:55 2017-12-28
 */
@RestController
@RequestMapping("/carousels")
public class CarouselController {

    private final Logger logger = LogManager.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private CarouselService carouselService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Carousel get(@PathVariable Long id) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/carousels, method: get, host:" + instance.getHost() + ", serviceId:" + instance.getServiceId() + ",carousel: " + id);
        Carousel carousel = carouselService.findOne(id);
        return carousel;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Carousel> save(@RequestBody Carousel carousel, UriComponentsBuilder ucb) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/carousel, method: get, host: " + instance.getHost() + ", serviceId: " + instance.getServiceId() + "usedFor: " + carousel.getUsedFor());

        Carousel saved = carouselService.save(carousel);

        HttpHeaders headers = new HttpHeaders();
        URI locationUri = ucb.path("/carousel")
                .path(String.valueOf(carousel.getId()))
                .build()
                .toUri();
        headers.setLocation(locationUri);

        ResponseEntity<Carousel> responseEntity = new ResponseEntity<>(saved, headers, HttpStatus.CREATED);
        return responseEntity;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/carousels, method: delete, host:" + instance.getHost() + ", serviceId:" + instance.getServiceId() + ",carousel: " + id);
        carouselService.delete(id);
    }

    @RequestMapping(value = "/getCarousels/{usedFor}",method = RequestMethod.GET, produces = "application/json")
    public List<Carousel> carousels(@PathVariable(value = "usedFor") String usedFor) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/carousel, get, host:" + instance.getHost() + ", serviceId:" + instance.getServiceId() + ",usedFor: " + usedFor);
        List<Carousel> carousels = carouselService.findByUsedFor(usedFor);
        return carousels;
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error resourceNotFound(ResourceNotFoundException e){
        Long resourceId = e.getResourceId();
        return new Error(4, "Category [" + resourceId + "] not found");
    }
}

