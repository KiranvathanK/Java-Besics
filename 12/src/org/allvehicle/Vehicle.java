package org.allvehicle;

public class Vehicle {

	public void vehicleNecessery() {
		System.out.println("Necessery Vehicles are");
	}
	
public static void main(String[] args) {
	Vehicle v = new Vehicle();
	v.vehicleNecessery();
	TwoWheller tv = new TwoWheller();
	tv.bike();
	tv.cycle();
	ThreeWheeler thv = new ThreeWheeler();
	thv.auto();
	FourWheeler fv = new FourWheeler();
	fv.car();
	fv.lorry();
	fv.bus();
	}
}	
