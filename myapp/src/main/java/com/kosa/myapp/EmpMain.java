package com.kosa.myapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		
		IEmpService empService = context.getBean(IEmpService.class);
		System.out.println(empService.getEmpCount());
		context.close();

	}

}
