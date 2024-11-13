package com.suriya.shoppingmall.impl_ordering;

import com.suriya.shoppingmall.interfacesample.Order;
//singleton calss
public class MobileTools implements Order {
	
	private static MobileTools mobiletools=new MobileTools();

	public static MobileTools getMobiletools() {
		return mobiletools;
	}

	public static void setMobiletools(MobileTools mobiletools) {
		MobileTools.mobiletools = mobiletools;
	}
	
	public MobileTools() {
		
	}
	
	
	public void ordering(){
		System.out.println("i am buying bluethoot headphone...");
	}
	

}
