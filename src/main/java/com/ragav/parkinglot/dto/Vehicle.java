package com.ragav.parkinglot.dto;

import com.ragav.parkinglot.enums.PaymentStrategy;
import com.ragav.parkinglot.enums.VehicleType;

public abstract class Vehicle {
	String licensePlate;
	VehicleType type;
	PaymentStrategy strategy;
	
	Vehicle(String licensePlate, VehicleType type, PaymentStrategy strategy) {
		this.licensePlate = licensePlate;
		this.type = type;
		this.strategy = strategy;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public PaymentStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
}
