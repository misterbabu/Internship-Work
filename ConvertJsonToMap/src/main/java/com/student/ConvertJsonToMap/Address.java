package com.student.ConvertJsonToMap;

public class Address {
	private int HNO;
	private String street;
	private String city;
	private int pinCode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int hNO, String street, String city, int pinCode) {
		super();
		HNO = hNO;
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}
	/**
	 * @return the hNO
	 */
	public int getHNO() {
		return HNO;
	}
	/**
	 * @param hNO the hNO to set
	 */
	public void setHNO(int hNO) {
		HNO = hNO;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the pinCode
	 */
	public int getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [HNO=" + HNO + ", street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	

}
