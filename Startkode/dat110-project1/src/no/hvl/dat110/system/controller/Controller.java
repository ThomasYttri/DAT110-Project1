package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.RPCClient;
import no.hvl.dat110.rpc.RPCServerStopStub;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class Controller  {
	
	private static int N = 5;
	
	public static void main (String[] args) {
		
		Display display;
		Sensor sensor;
		
		RPCClient displayclient,sensorclient;
		
		System.out.println("Controller starting ...");
				
		RPCServerStopStub stopdisplay = new RPCServerStopStub();
		RPCServerStopStub stopsensor = new RPCServerStopStub();
		
		displayclient = new RPCClient(Common.DISPLAYHOST,Common.DISPLAYPORT);
		sensorclient = new RPCClient(Common.SENSORHOST,Common.SENSORPORT);

		// connect to sensor and display RPC servers
		// create local display and sensor objects
		// register display and sensor objects in the RPC layer

		sensorclient.connect();
		displayclient.connect();

		sensor = new Sensor();
		display = new Display();

		sensorclient.register(sensor);
		displayclient.register(display);

		// register stop methods in the RPC layer
		displayclient.register(stopdisplay);
		sensorclient.register(stopsensor);

		// loop while reading from sensor and write to display via RPC
		int i = 0;
		while(i < N) {
			int temp = sensor.read();
			display.write(Integer.toString(temp));

			try {
				sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			i++;
		}
		
		stopdisplay.stop();
		stopsensor.stop();
	
		displayclient.disconnect();
		sensorclient.disconnect();
		
		System.out.println("Controller stopping ...");
		
	}
}
