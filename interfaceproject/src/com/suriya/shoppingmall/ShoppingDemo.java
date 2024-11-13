package com.suriya.shoppingmall;

import com.suriya.shoppingmall.entity.*;
import com.suriya.shoppingmall.impl_ordering.ComputerTools;
import com.suriya.shoppingmall.impl_ordering.MobileTools;
import com.suriya.shoppingmall.interfacesample.Order;

public class ShoppingDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCid(101);
		c1.setCname("suriya");
		c1.setCity("cuddalore");
		c1.setProduct("ComputerTools");
		
		System.out.println(c1);
		
		Order order;
		   
		String choice=c1.getProduct();
		
		if(choice.equals("mobiletools"))
		{
			order=MobileTools.getMobiletools();
		}
		else
		{
			order=ComputerTools.getComputertools();
		}
		order.ordering();
	}

}
