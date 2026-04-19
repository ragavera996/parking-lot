package com.ragav.parkinglot.dto;

import com.ragav.parkinglot.enums.PaymentStrategy;
import com.ragav.parkinglot.enums.VehicleType;

public class Truck extends Vehicle{

	Truck(String licensePlate, VehicleType type, PaymentStrategy strategy) {
		super(licensePlate, type, strategy);
	}

}
