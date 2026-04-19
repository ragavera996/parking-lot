package com.ragav.parkinglot.service;

import org.springframework.stereotype.Component;

import com.ragav.parkinglot.dto.ParkingSpot;
import com.ragav.parkinglot.dto.Vehicle;
import com.ragav.parkinglot.enums.VehicleType;

@Component
public class EntryServiceImpl implements EntryService{

	@Override
	public ParkingSpot findSpot(Vehicle vehicle) {
		ParkingSpot spot = new ParkingSpot(1, VehicleType.CAR, false);
		return spot;
	}

	@Override
	public ParkingSpot parkVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

}
