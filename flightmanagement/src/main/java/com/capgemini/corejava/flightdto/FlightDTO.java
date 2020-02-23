package com.capgemini.corejava.flightdto;

import java.io.Serializable;
import java.math.BigInteger;

public class FlightDTO implements Serializable {
	private int flightNumber;
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	private String flightModel;
	private String carrierName;
	private int seatCapacity;
	public void display() {
		// TODO Auto-generated method stub
		
		
	}
	public FlightDTO(int flightNumber, String flightModel, String carrierName, int seatCapacity) {
		super();
		this.flightNumber = flightNumber;
		this.flightModel = flightModel;
		this.carrierName = carrierName;
		this.seatCapacity = seatCapacity;
	}
		
		public FlightDTO() {
			
		}
		@Override
		public String toString() {
			return "FlightDTO [flightNumber=" + flightNumber + ", flightModel=" + flightModel + ", carrierName="
					+ carrierName + ", seatCapacity=" + seatCapacity + "]";
		}
	}

