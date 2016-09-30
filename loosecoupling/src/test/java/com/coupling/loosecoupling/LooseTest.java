package com.coupling.loosecoupling;

import static org.junit.Assert.*;

import org.junit.Test;

public class LooseTest {

	@Test
	public void test() {
		
		Traveller tr = new Traveller();
		Vehicle v = new Car("");
		tr.setVehicle(v);
		tr.getVehicle();
		tr.setKmTravelled(20);
		int xxx = tr.getKmTravelled();
		
		int str= tr.getTravelDetails();
		
		assertEquals(200 , xxx);
		
	}

}
