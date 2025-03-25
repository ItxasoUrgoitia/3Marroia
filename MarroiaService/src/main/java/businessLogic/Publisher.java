package businessLogic;

import javax.xml.ws.Endpoint;


import businessLogic.FlightManager;

public class Publisher {
	public static void main (String args[]){
		Endpoint.publish("http://0.0.0.0:9999/ws",
		new FlightManager());
		System.out.println("Service published");
	}
}
