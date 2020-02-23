package com.capgemini.corejava.flightdao;
//import com.capgemini.corejava.flightservice.*;

import com.capgemini.corejava.flight.*;
import com.capgemini.corejava.flightdto.*;

import java.awt.List;
import java.math.BigInteger;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Iterator;



import com.capgemini.corejava.flightdto.FlightDTO;



public  class FlightDAOImpl implements FlightDao {
	

	
	static HashMap<Integer,FlightDTO> hm=new HashMap<Integer,FlightDTO>();
	/*public void insertFlight() {
	FlightDTO f1=new FlightDTO(1,"Vip","Indigo",10);
	 FlightDTO f2=new FlightDTO(2,"General","KingFisher",15);
	 hm.put(f1.getFlightNumber(),f1);
	 hm.put(f2.getFlightNumber(),f2);
	}*/

	public  int addFlight(FlightDTO dt)
		 {
        	 
	hm.put(dt.getFlightNumber(),dt);
		int r=dt.getFlightNumber();
		System.out.println(hm.containsKey(r));
		
		//System.out.println(hm.get(r));
		return r;
		 }
      public FlightDTO viewFlights(int flightNumber)
      {
    	  FlightDTO dt=new FlightDTO();
    	  if(hm.containsKey(flightNumber))
    	  {
    		  dt=hm.get(flightNumber);
    		  return dt;
    	  }
    	  else {
    		  return dt;
    	  }
      }
      public FlightDTO deleteFlight(int b)
      {
    	  FlightDTO dt=new FlightDTO();
    	  if(hm.containsKey(b))
    	  {
    		  dt=hm.remove(b);
    		  return dt;
    	  }
    	  else
    	  {
    		  return dt;
    	  }
      }
      public FlightDTO viewAllFlights()
      {
    	  Set<Entry<Integer,FlightDTO>> setOfEntries=hm.entrySet();
    	  Iterator<Entry<Integer,FlightDTO>> itr=setOfEntries.iterator();
    	  for(Entry<Integer,FlightDTO> entry:setOfEntries)
    	  {
    		  System.out.println("FlightNumber :"+entry.getKey()+" "+"Details :"+entry.getValue());
    	  }
    	  return null;
      }
	/*
	 * public java.util.List<Object> listFlight() throws Exception {
	 * 
	 * Collection<FlightDTO> collection = hm.values(); java.util.List<Object> list =
	 * new ArrayList<Object>(); for(FlightDTO a : collection) list.add(a); return
	 * list; }
	 */
      }

