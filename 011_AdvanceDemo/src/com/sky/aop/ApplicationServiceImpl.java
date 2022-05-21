package com.sky.aop;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService{

	@Override
	public void processApplication() {
		
		System.out.println("Process application form");
	}
@Auditable(value="check")
//@Transactional
	@Override
	public String processApplicationWithAudit() {
		System.out.println("process application form in serice");
		return "success";
	}
	
	

}
