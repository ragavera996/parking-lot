package com.ragav.parkinglot.dto;

import com.ragav.parkinglot.enums.PaymentStrategy;
import com.ragav.parkinglot.enums.VehicleType;

public class VehicleFactory {
	public static Vehicle createVehicle(String licensePlate, VehicleType type, PaymentStrategy strategy) {
		switch(type) {
			case BIKE:
				return new Bike(licensePlate, type, strategy);
			case TRUCK:
				return new Truck(licensePlate, type, strategy);
			default:
				return new Car(licensePlate, type, strategy);
		}
	}
}
