package com.ragav.parkinglot.dto;

import java.util.List;

public class ParkingLot {
	int lot_id;
	List<ParkingSpot> parkingSpots;
	
	public ParkingLot(int lot_id, List<ParkingSpot> parkingSpots) {
		this.lot_id = lot_id;
		this.parkingSpots = parkingSpots;
	}
	
	public int getLot_id() {
		return lot_id;
	}
	
	public void setLot_id(int lot_id) {
		this.lot_id = lot_id;
	}
	public List<ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	public void setParkingSpots(List<ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}

	public ParkingSpot findAvailableSpot(Vehicle vehicle) {
		for(ParkingSpot spot: parkingSpots) {
			if(spot.getType() == vehicle.getType() && !spot.isOccupied) {
				return spot;
			}
		}
		
		return null;
		
	}

	public ParkingSpot createEntry(Vehicle vehicle) {
		ParkingSpot spot = findAvailableSpot(vehicle);
		if(spot != null) {
			spot.setOccupied(true);
			return spot;
		}
		System.out.println("No spots available");
		return null;
		
		
	}

}
