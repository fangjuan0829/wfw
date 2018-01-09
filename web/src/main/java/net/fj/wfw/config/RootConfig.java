package net.fj.wfw.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * wfw Project
 * net.fj.wfw.config
 * 2017-12-28-14:18
 * 2017fj
 * Created by fannyfang on 2017-12-28.
 */
/**
 * @Author:fannyfang
 * @Description:配置
 * @Date:14:18 2017-12-28
 */
@Configuration
public class RootConfig {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
