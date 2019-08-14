package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripDetailController {

	@GetMapping("/getPastTrips")
	public String getPastTrips() {
		return "ch40-to-ch50,ch60-to-ch117";
	}
	
	@GetMapping("/upComingTrips")
	public String upComingTrips() {
		
		return "ch-117 to ch-40";
	}
}
