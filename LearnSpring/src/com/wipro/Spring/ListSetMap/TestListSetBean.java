package com.wipro.Spring.ListSetMap;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestListSetBean {
	private List coffeeFlavours;
	private Set brandNames;
	private Map coffeeShopPlaces;
	
	public List getCoffeeFlavours() {
		return coffeeFlavours;
	}
	public void setCoffeeFlavours(List coffeeFlavours) {
		this.coffeeFlavours = coffeeFlavours;
	}
	public Set getBrandNames() {
		return brandNames;
	}
	public void setBrandNames(Set brandNames) {
		this.brandNames = brandNames;
	}
	public Map getCoffeeShopPlaces() {
		return coffeeShopPlaces;
	}
	public void setCoffeeShopPlaces(Map coffeeShopPlaces) {
		this.coffeeShopPlaces = coffeeShopPlaces;
	}
	
	public void printData(){
		System.out.println("List of coffee flavours");
		for(Object flavours:coffeeFlavours){
			System.out.println(flavours);
		}
		System.out.println("Set of brand Names");
		for(Object brands:brandNames){
			System.out.println(brands);
		}
		System.out.println("Map of places and coffee shops");
		for(Object key:coffeeShopPlaces.keySet()){
			System.out.println("The shop name for:"+key+"place name:"+coffeeShopPlaces.get(key));
		}
	}


}
