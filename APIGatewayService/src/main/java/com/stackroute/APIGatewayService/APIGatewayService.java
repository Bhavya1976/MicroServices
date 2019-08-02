package com.stackroute.APIGatewayService;

import com.stackroute.APIGatewayService.filter.ErrorFilter;
import com.stackroute.APIGatewayService.filter.PostFilter;
import com.stackroute.APIGatewayService.filter.PreFilter;
import com.stackroute.APIGatewayService.filter.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class APIGatewayService {

	public static void main(String[] args) {
		SpringApplication.run(APIGatewayService.class, args);


	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}

