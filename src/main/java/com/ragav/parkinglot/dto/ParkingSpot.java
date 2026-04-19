package com.ragav.parkinglot.dto;

import com.ragav.parkinglot.enums.VehicleType;

public class ParkingSpot {
	int spot_id;
	VehicleType type;
	boolean isOccupied;
	
	public ParkingSpot(int spot_id, VehicleType type, boolean isOccupied) {
		this.spot_id = spot_id;
		this.type = type;
		this.isOccupied = isOccupied;
	}
	
	public int getSpot_id() {
		return spot_id;
	}
	public void setSpot_id(int spot_id) {
		this.spot_id = spot_id;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
	public boolean isOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

}
