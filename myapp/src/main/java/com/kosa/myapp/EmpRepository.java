package com.kosa.myapp;

public class EmpRepository implements IEmpRepository {

	@Override
	public int getEmpCount() {
		System.out.println("empRepository.getEmpCount");
		return 14;
	}
	
}
