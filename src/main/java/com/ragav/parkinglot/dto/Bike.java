package com.ragav.parkinglot.dto;

import com.ragav.parkinglot.enums.PaymentStrategy;
import com.ragav.parkinglot.enums.VehicleType;

public class Bike extends Vehicle{

	Bike(String licensePlate, VehicleType type, PaymentStrategy strategy) {
		super(licensePlate, type, strategy);
	}

}
