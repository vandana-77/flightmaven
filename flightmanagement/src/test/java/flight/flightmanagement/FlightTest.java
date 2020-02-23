package flight.flightmanagement;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.corejava.*;
import com.capgemini.corejava.flightdao.*;
import com.capgemini.corejava.flightdto.*;
import com.capgemini.corejava.flightservice.*;
import java.util.HashMap;
import java.util.List;


import com.capgemini.corejava.flightdao.FlightDAOImpl;
import com.capgemini.corejava.flightdto.FlightDTO;
import junit.framework.TestCase;

public class FlightTest {
	FlightDAOImpl d=null;

	
	public void setup()
	{
		d=new FlightDAOImpl();
	
	}
	
	@Test
	void test() throws Exception
	{
		FlightDTO dt=new FlightDTO();
		d.addFlight(dt);
		dt.setFlightNumber(456);
		dt.setFlightModel("indigo");
		dt.setCarrierName("vandy");
		dt.setSeatCapacity(56);
		List<Object> l=d.listFlight();
      		assertEquals(1,l.size());
	}


	private void assertEquals(int i, int size) {
		
		// TODO Auto-generated method stub
		
	}


}