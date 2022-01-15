package com.wipro.Spring;

public class TeaFlavourCompany {
	
	private String flavour;
	private TeaCompany[] teaCompany;	
	//private TeaCompany teaCompany2;

    public TeaFlavourCompany(){
      
    }
    
	public TeaCompany[] getTeaCompany() {
		return teaCompany;
	}

	public void setTeaCompany(TeaCompany[] teaCompany) {
		this.teaCompany = teaCompany;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
		
	}
	
	public void printData()
	{
		for(TeaCompany tea:teaCompany){
			System.out.println(tea.getTeaProductName());
		}
	}

	

}
