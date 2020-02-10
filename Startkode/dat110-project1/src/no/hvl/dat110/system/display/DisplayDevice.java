package no.hvl.dat110.system.display;

import no.hvl.dat110.rpc.RPCServer;
import no.hvl.dat110.system.controller.Common;


public class DisplayDevice {
	
	public static void main(String[] args) {
		// implement the operation of the display RPC server
		// see how this is done for the sensor RPC server in SensorDevice
		System.out.println("Display server starting ...");

		DisplayImpl display = new DisplayImpl();
		RPCServer dispServ = new RPCServer(Common.DISPLAYPORT);
		dispServ.register(1, display);
		dispServ.run();
		dispServ.stop();
		
		System.out.println("Display server stopping ...");
		
	}
}
