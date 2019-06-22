package com.cg.airplanereservationsystem.bean;

public class Airport {
	private String abbrevation;
	private String airportName;
	private String location;

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Airport [abbrevation=" + abbrevation + ", airportName="
				+ airportName + ", location=" + location + "]";
	}

}
