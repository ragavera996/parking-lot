package com.ragav.parkinglot.dto;

import com.ragav.parkinglot.enums.PaymentStrategy;
import com.ragav.parkinglot.enums.VehicleType;

public class Car extends Vehicle{

	Car(String licensePlate, VehicleType type, PaymentStrategy strategy) {
		super(licensePlate, type, strategy);
	}

}
