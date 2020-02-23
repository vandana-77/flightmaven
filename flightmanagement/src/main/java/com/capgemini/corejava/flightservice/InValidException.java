package com.capgemini.corejava.flightservice;

public class InValidException extends Exception{
	public InValidException(String excp) {
		System.out.println(excp);
	}
}
