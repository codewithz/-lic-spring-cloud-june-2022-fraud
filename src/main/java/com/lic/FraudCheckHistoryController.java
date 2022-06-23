package com.lic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fraudcheck")
public class FraudCheckHistoryController {

    @Autowired
    FraudCheckHistoryService service;

    @GetMapping("/{customerId}")
    public FraudCheckHistory isFraudster(@PathVariable Integer custumerId){
        FraudCheckHistory fraudCheck=service.isFraudulentCustomer(custumerId);

        System.out.println("Test");
        return fraudCheck;


    }

}
