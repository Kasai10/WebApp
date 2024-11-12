package edu.fra.uas.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SecondService {
	
	@Autowired
	private CounterService counterService;
	private static final Logger log = LoggerFactory.getLogger(SecondService.class);

	@Autowired
	private ThirdService thirdService;
	
	public void doSomething() {
		log.info("secondService --> doSomething()");
		counterService.count();
		log.info("Counter of Beans: " + counterService.getCount());
		thirdService.funClass();
	}

}
