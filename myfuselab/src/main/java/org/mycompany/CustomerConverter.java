package org.mycompany;

import org.apache.camel.Converter;
import org.apache.camel.TypeConverters;

public class CustomerConverter implements TypeConverters {

	@Converter
	public CustomerDemo toCustomerDemo(String json){
		System.out.println("Called customer converter");
		return new CustomerDemo();
	}

}
