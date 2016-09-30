package com.coupling.loosecoupling;

public class Car implements Vehicle {
	
	private String regno;
	
		public Car(String regno) {
		this.regno = regno;
	}

	
	public String getRegno() {
			return regno;
		}


	public void setRegno(String regno) {
			this.regno = regno;
		}


	public int getTravelCost() {
		
		return 10;
	}

}
