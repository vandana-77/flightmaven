package com.capgemini.corejava.flight;
import java.lang.Iterable;

import com.capgemini.corejava.flightdto.FlightDTO;

import com.capgemini.corejava.flightservice.*;

import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.capgemini.corejava.flightservice.FlightService;


public class Flight {

	
	//private static List list;

	public static void main(String[] args) throws Exception{
	
		// TODO Auto-generated method stub
		int flightNumber = 0;
		String flightModel="";
		String carrierName="";
		int seatCapacity=0;
		int ch,ch1=1;
		Scanner s=new Scanner(System.in);
		FlightServiceImpl f=new FlightServiceImpl();
		while(ch1!=0)
		{
			System.out.println("1.addFlight");
			System.out.println("2.viewFlight");
			System.out.println("3.deleteFlight");
			System.out.println("4.viewAllFlight");
			ch=s.nextInt();
			//Map map;
			switch(ch)
			{
				case 1:int flag=1;
					while(flag==1)
					{
					 System.out.println("Enter Flight Number");
					//flightNumber=s.next();
					 try{
						flightNumber=Integer.valueOf(s.next());
					    }
					  catch(NumberFormatException e)
   					   {
						  flag=0;
       					     System.out.println("Flight number must contain only digits.please enter a valid flight number ");
    					    }
					}		
					System.out.println("Enter Flight Model");
					flightModel=s.next();
					System.out.println("Enter Carrier Name");
					carrierName=s.next();
					System.out.println("Enter Seat Capacity");
					seatCapacity=s.nextInt();
					if(Integer.toString(seatCapacity).length()!=2)
					{
						try {
							throw new InValidException("Invalid SeatCapacity");
						}catch(InValidException e) {
							System.out.println(e);;
						}
					}
					
				
				//	FlightService f=new FlightService();
					int count=f.addFlightService(flightNumber,flightModel,carrierName,seatCapacity);
					System.out.println("inserted "+count+ "record success");
				
				break;
				case 2:
					System.out.println("Enter flightnumber:");
					int flightid = s.nextInt();
					try {
				
						FlightDTO dt = f.ViewFlights(flightid);
						if(dt.getFlightNumber()==flightid)
						{
							System.out.println("FlightNumber :"+dt.getFlightNumber()+" FlightName:"+dt.getFlightModel()+" CarrierName:"+dt.getCarrierName()+" SeatCapacity :"+dt.getSeatCapacity());
						
					}
						else
						{
							System.out.println("sorry details not found");
						}
					}
					catch(Exception e)
					{
						System.out.println("not found");
					}
					break;
			
				case 3:
					System.out.println("Enter flightnumber:");
					int b = s.nextInt();
					try {
				
						FlightDTO dt = f.deleteFlight(b);
						if(dt.getFlightNumber()==b)
						{
							System.out.println(b +"deleted succesfully");
						
					}
						else
						{
							System.out.println("sorry details not found");
						}
					}
					catch(Exception e)
					{
						System.out.println("not found");
					}
					break;
				case 4:
				{
					f.viewAllFlights();
				}
			}
					
		}
	
}
}
