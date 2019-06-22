package com.cg.airplanereservationsystem.bean;

import java.util.Date;

public class FlightInformation {
	private int flightNo;
	private String airLine;
	private String depCity;
	private String arrCity;
	private Date depDate;
	private Date arrDate;
	private int firstSeats;
	private int busSeats;
	private double firstSeatFare;

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public String getAirLine() {
		return airLine;
	}

	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}

	public String getDepCity() {
		return depCity;
	}

	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	public String getArrCity() {
		return arrCity;
	}

	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}

	public Date getDepDate() {
		return depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	public Date getArrDate() {
		return arrDate;
	}

	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
	}

	public int getFirstSeats() {
		return firstSeats;
	}

	public void setFirstSeats(int firstSeats) {
		this.firstSeats = firstSeats;
	}

	public int getBusSeats() {
		return busSeats;
	}

	public void setBusSeats(int busSeats) {
		this.busSeats = busSeats;
	}

	public double getFirstSeatFare() {
		return firstSeatFare;
	}

	public void setFirstSeatFare(double firstSeatFare) {
		this.firstSeatFare = firstSeatFare;
	}

	@Override
	public String toString() {
		return "FlightInformation [flightNo=" + flightNo + ", airLine="
				+ airLine + ", depCity=" + depCity + ", arrCity=" + arrCity
				+ ", depDate=" + depDate + ", arrDate=" + arrDate
				+ ", firstSeats=" + firstSeats + ", busSeats=" + busSeats
				+ ", firstSeatFare=" + firstSeatFare + "]";
	}

}
