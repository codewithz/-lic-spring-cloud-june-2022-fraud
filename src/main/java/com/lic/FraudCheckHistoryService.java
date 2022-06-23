package com.lic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FraudCheckHistoryService {

    @Autowired
    FraudCheckHistoryRepository repository;

    public FraudCheckHistory isFraudulentCustomer(Integer customerId){
        FraudCheckHistory fraudCheck=repository.save(
                new FraudCheckHistory(customerId,
                        getFraud(customerId),
                        LocalDateTime.now())
        );
        return fraudCheck;
    }

    public boolean getFraud(Integer customerId){
        return customerId%2==0;
    }
}
