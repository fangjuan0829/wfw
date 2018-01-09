package net.fj.wfw;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients//开启扫描Spring Cloud Feign客户端的功能
public class WfwWebApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(WfwWebApplication.class).web(true).run(args);
	}
}
