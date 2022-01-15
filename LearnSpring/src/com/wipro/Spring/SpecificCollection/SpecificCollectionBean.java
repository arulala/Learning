package com.wipro.Spring.SpecificCollection;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class SpecificCollectionBean {
	private Vector coffeeFlavours;
	private TreeSet brandNames;
	private HashMap coffeeShopPlaces;
	public void setCoffeeFlavours(Vector coffeeFlavours) {
		this.coffeeFlavours = coffeeFlavours;
	}
	public void setBrandNames(TreeSet brandNames) {
		this.brandNames = brandNames;
	}
	public void setCoffeeShopPlaces(HashMap coffeeShopPlaces) {
		this.coffeeShopPlaces = coffeeShopPlaces;
	}
	public void printData(){
		for(Object flavour:coffeeFlavours){
			System.out.println("The Vector of flavours:"+flavour);
		}
		for(Object brandName:brandNames){
			System.out.println("The TreeSet of brand names:"+brandNames);
		}
		Set keys = coffeeShopPlaces.keySet();
		for(Object coffeeSopPlace:keys){
			System.out.println("The coffeShop is:"+coffeeSopPlace+"The place is:"+coffeeShopPlaces.get(coffeeSopPlace));
		}
	}


}
