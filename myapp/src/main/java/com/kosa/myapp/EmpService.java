package com.kosa.myapp;

public class EmpService implements IEmpService {
	
	IEmpRepository empRepository;

	public void setEmpRepository(IEmpRepository empRepository) {
		this.empRepository = empRepository;
	}


	@Override
	public int getEmpCount() {
		System.out.println("empService.getEmpCount");
		return empRepository.getEmpCount();
	}
}
