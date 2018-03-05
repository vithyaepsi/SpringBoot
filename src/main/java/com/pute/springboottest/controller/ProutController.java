/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pute.springboottest.controller;

import com.pute.springboottest.Customer;
import com.pute.springboottest.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author andré le paté
 */
@RestController
public class ProutController {
    
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/")
    public String index() {
        String buffer = "";
        for (Customer customer : customerRepository.findAll()) {
            buffer += customer.getFirstName();
        }
        
        return "Greetings from Spring Boot!" + buffer;
    }

}
