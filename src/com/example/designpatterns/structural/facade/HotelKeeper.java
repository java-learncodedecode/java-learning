package com.example.designpatterns.structural.facade;

public class HotelKeeper {

	public Menus getVegMenu()
    {
        VegMenu v = new VegMenu();
        return v.getMenus();
    }
      
    public Menus getNonVegAndVegMenu()
    {
    	NonVegAndVegMenu nonvegandveg = new NonVegAndVegMenu();
		return nonvegandveg.getMenus();
    }
      
    public Menus getNonVegMenu()
    {
    	NonVegMenu v = new NonVegMenu();
        return v.getMenus();
    }    
	
	
	
}
