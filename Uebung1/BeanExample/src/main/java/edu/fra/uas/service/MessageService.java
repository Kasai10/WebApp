package edu.fra.uas.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.fra.uas.controller.BeanController;



@Component
public class MessageService {
    private static final Logger log =LoggerFactory.getLogger(MessageService.class);
    private String message;
    private int counter;

    @Autowired
	private BeanController beanController;

    public String getMessage(){
        log.debug(beanController.putMessage("accessed message: " + message));
        return message;
    }

    public void setMessage(String message){
        log.debug(beanController.putMessage("changed message to: " + message));
        this.message = message;
    }

    public int increment(){
        this.counter += 1;
        return counter;
    }

}
