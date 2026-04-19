package com.ragav.parkinglot.dao;

import com.ragav.parkinglot.dto.ParkingSpot;
import com.ragav.parkinglot.dto.Vehicle;

public interface EntryDAO {
	ParkingSpot findSpot(Vehicle vehicle);
	ParkingSpot parkVehicle(Vehicle vehicle); 
}
