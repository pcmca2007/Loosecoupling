package com.coupling.loosecoupling;

public class Traveller {
	
	private Vehicle vehicle;
	private int kmTravelled;
	
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public int getKmTravelled() {
		return kmTravelled;
	}
	
	public void setKmTravelled(int kmTravelled) {
		this.kmTravelled = kmTravelled;
	}
	
	public  int getTravelDetails(){
		
		//return "Travelled"+" "+this.kmTravelled+" "+"km."+" "+"Total Cost="+vehicle.getTravelCost()*this.kmTravelled;
		return vehicle.getTravelCost()*this.kmTravelled; 
	}

}
