package com.ragav.parkinglot.test;

import java.util.ArrayList;
import java.util.List;

import com.ragav.parkinglot.dto.Bike;
import com.ragav.parkinglot.dto.ParkingLot;
import com.ragav.parkinglot.dto.ParkingSpot;
import com.ragav.parkinglot.dto.Vehicle;
import com.ragav.parkinglot.dto.VehicleFactory;
import com.ragav.parkinglot.enums.PaymentStrategy;
import com.ragav.parkinglot.enums.VehicleType;

public class Main {
	public static void main(String[] args) {
		List<ParkingSpot> spotList = new ArrayList<>();
		spotList.add(new ParkingSpot(1, VehicleType.BIKE, false));
		spotList.add(new ParkingSpot(2, VehicleType.BIKE, false));
		spotList.add(new ParkingSpot(3, VehicleType.CAR, false));
		spotList.add(new ParkingSpot(4, VehicleType.CAR, false));
		spotList.add(new ParkingSpot(5, VehicleType.TRUCK, false));
		spotList.add(new ParkingSpot(6, VehicleType.TRUCK, false));
		
		ParkingLot lot = new ParkingLot(123, spotList);
		
		
		Vehicle vehicle = VehicleFactory.createVehicle("CSR504", VehicleType.BIKE, PaymentStrategy.HOURLY);
		ParkingSpot spot = lot.findAvailableSpot(vehicle);
		
		if(spot == null) {
			System.out.println("No spots available");
		}
		
		ParkingSpot parkedSpot = lot.createEntry(vehicle);
		System.out.println(parkedSpot);
		
	}

}
