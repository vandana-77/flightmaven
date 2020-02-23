package com.capgemini.corejava.flightdao;

import com.capgemini.corejava.flight.Flight;
import com.capgemini.corejava.flightdto.FlightDTO;


public interface FlightDao {
		//Flight getFlightDetails(int flightNumber,String flightModel,String carrierName,int seatCapacity);

		public int addFlight(FlightDTO dt);
		
}
