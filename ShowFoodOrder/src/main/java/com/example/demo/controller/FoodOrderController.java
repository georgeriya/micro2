package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodOrderController {

	@GetMapping("/getPastOrders")
	public String getPastOrders() {
		return "springroll, kabab, pasta";
	}
	
	@GetMapping("/upComingOrders")
	public String upComingOrders() {
		
		return "biriyani, pizza";
	}
}
