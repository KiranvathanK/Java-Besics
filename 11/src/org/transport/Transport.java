package org.transport;

import org.air.*;
import org.road.*;
import org.water.*;

public class Transport {
	public void transportForm() {
		
		System.out.println("The Transport Details");
	}
	
public static void main(String[] args) {
	Transport trns = new Transport();
	trns.transportForm();
	Road rd = new Road();
	rd.bike();
	rd.bus();
	rd.car();
	rd.cycle();
	Air ar = new Air();
	ar.aeroPlane();
	ar.heliCopter();
	Water wt = new Water();
	wt.ship();
	wt.boat();
}

}
