package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.demo.filters.MyPostFilter;
import com.example.demo.filters.MyPreFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class MyZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyZuulProxyApplication.class, args);
	}

	@Bean
	public MyPostFilter post() {
		return new MyPostFilter();
	}
	
	@Bean
	public MyPreFilter pre() {
		return new MyPreFilter();
	}
}
