package com.wipro.Spring;

public class TeaCompany {
	
	private String teaProductName;
	private String teaPrice;
	private String[] flavours;
	public String[] getFlavours() {
		return flavours;
	}
	public void setFlavours(String[] flavours) {
		this.flavours = flavours;
	}
	
	public String getTeaPrice() {
		return teaPrice;
	}
	public void setTeaPrice(String teaPrice) {
		this.teaPrice = teaPrice;
	}
	public String getTeaProductName() {
		return teaProductName;
	}
	public void setTeaProductName(String teaProductName) {
		this.teaProductName = teaProductName;
	}

}
