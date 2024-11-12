package edu.fra.uas.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ThirdService {
    private static final Logger log = LoggerFactory.getLogger(SecondService.class);

    @Autowired
    private CounterService counterService;
    public void funClass(){
        counterService.count();
        log.info("Third Service counter is " + counterService.getCount());
    }
}
