package edu.fra.uas.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {
    private int counter = 0;
    public void count(){
        counter += counter;
    }

    public int getCount(){
        return this.counter;
    }
}
