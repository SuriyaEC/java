package com.suriya.shoppingmall.impl_ordering;

import com.suriya.shoppingmall.interfacesample.*;

public class ComputerTools implements Order {
	
	private static ComputerTools computertools=new ComputerTools();

	public static ComputerTools getComputertools() {
		return computertools;
	}

	public static void setComputertools(ComputerTools computertools) {
		ComputerTools.computertools = computertools;
	}
	
	public ComputerTools() {
		
	}
	
	
	public void ordering(){
		System.out.println("i am buying a harddisk...");
	}

}
