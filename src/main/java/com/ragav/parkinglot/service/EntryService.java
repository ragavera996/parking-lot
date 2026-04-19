package com.ragav.parkinglot.service;

import org.springframework.stereotype.Service;

import com.ragav.parkinglot.dto.ParkingSpot;
import com.ragav.parkinglot.dto.Vehicle;

@Service
public interface EntryService {
	ParkingSpot findSpot(Vehicle vehicle);
	ParkingSpot parkVehicle(Vehicle vehicle);
}
