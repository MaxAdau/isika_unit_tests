package com.isika.adau.virtualhouse;

public class Address {
	public int streetNumber;
	public String streetName;
	public int cityCode;
	public String cityName;

	public Address(int streetNumber, String address, int cityCode, String cityName) {
		this.streetNumber = streetNumber;
		this.streetName = address;
		this.cityCode = cityCode;
		this.cityName = cityName;
	}
	
	public String getFormattedAddress( ) {
		return this.streetNumber + " " + this.streetName + " " + this.cityCode + " " + this.cityName;
	}
	
}