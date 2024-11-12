package edu.fra.uas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

	@Autowired
	private CounterService counterService;
	// Constructor Injection: im ersten Schritt auskommentieren
	@Autowired
	private SecondService secondService;
	
	//public FirstService() {
	//	secondService = new SecondService();
	//	counterService = new CounterService();
	//}
	
	// Constructor Injection
	//@Autowired
	//public FirstService(SecondService secondService) {
	//	this.secondService = secondService;
	//}
	

	
	public void doSomething() {
		counterService.count();
		secondService.doSomething();
	}
	
}
