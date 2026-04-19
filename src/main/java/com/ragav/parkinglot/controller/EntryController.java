package com.ragav.parkinglot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ragav.parkinglot.dto.ParkingSpot;
import com.ragav.parkinglot.dto.Vehicle;
import com.ragav.parkinglot.dto.VehicleFactory;
import com.ragav.parkinglot.enums.PaymentStrategy;
import com.ragav.parkinglot.enums.VehicleType;
import com.ragav.parkinglot.service.EntryServiceImpl;

@RestController
@RequestMapping("/api/entry")
public class EntryController {
	@Autowired
	private EntryServiceImpl entryService;
	
	@GetMapping("/spots")
	int getSpots() {
		Vehicle vehicle = VehicleFactory.createVehicle("CSR504", VehicleType.BIKE, PaymentStrategy.HOURLY);
		ParkingSpot spot = this.entryService.findSpot(vehicle);
		return spot.getSpot_id();
		
	}

}
