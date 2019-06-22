package com.cg.airplanereservationsystem.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingInformation {
	@Id
	private String bookingId;
	private String custEmail;
	private int noOfPassengers;
	private String classType;
	private double totalFare;
	private int seatNo;
	private String creditCardInfo;
	private String srcCity;
	private String destCity;

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(String creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public String getSrcCity() {
		return srcCity;
	}

	public void setSrcCity(String srcCity) {
		this.srcCity = srcCity;
	}

	public String getDestCity() {
		return destCity;
	}

	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}

	@Override
	public String toString() {
		return "BookingInformation [bookingId=" + bookingId + ", custEmail="
				+ custEmail + ", noOfPassengers=" + noOfPassengers
				+ ", classType=" + classType + ", totalFare=" + totalFare
				+ ", seatNo=" + seatNo + ", creditCardInfo=" + creditCardInfo
				+ ", srcCity=" + srcCity + ", destCity=" + destCity + "]";
	}

}
