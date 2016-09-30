package com.coupling.loosecoupling;

public class Van implements Vehicle {
	
	private String regno;
	
	public Van(String regno) {
		super();
		this.regno = regno;
	}

	
	public String getRegno() {
		return regno;
	}


	public void setRegno(String regno) {
		this.regno = regno;
	}


	public int getTravelCost() {
		// TODO Auto-generated method stub
		return 5;
	}

}
