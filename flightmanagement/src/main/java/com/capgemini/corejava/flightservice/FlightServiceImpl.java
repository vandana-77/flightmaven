package com.capgemini.corejava.flightservice;

import com.capgemini.corejava.flightdto.*;
import com.capgemini.corejava.flightdao.*;
import com.capgemini.corejava.flight.*;

import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;

//import com.capgemini.corejava.flight.FlightDTO;
//import com.capgemini.corejava.flightdao.FlightDAOImpl;


public class FlightServiceImpl implements FlightService {
	public int addFlightService(int flightNumber,String flightModel,String carrierName,int seatCapacity)
	{
		
		FlightDTO dt=new FlightDTO(flightNumber, flightModel, carrierName, seatCapacity);
		dt.setFlightNumber(flightNumber);
		dt.setFlightModel(flightModel);
		dt.setCarrierName(carrierName);
		dt.setSeatCapacity(seatCapacity);
		FlightDAOImpl d=new FlightDAOImpl();
		
		int updateResult=0;
		
	
		try {
			
			updateResult=d.addFlight(dt);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		return updateResult;
		
	
	}

	public FlightDTO ViewFlights(int flightid) {
		FlightDAOImpl d=new FlightDAOImpl();
		FlightDTO dt=d.viewFlights(flightid);
		return dt;
	}
	public static FlightDTO deleteFlight(int b) throws Exception
	{
		FlightDAOImpl d=new FlightDAOImpl();
		FlightDTO dt=d.deleteFlight(b);
		return dt;
		
	}
	public FlightDTO viewAllFlights()
	{
		FlightDAOImpl d=new FlightDAOImpl();
		FlightDTO dt=d.viewAllFlights();
		return dt;
	}
}
