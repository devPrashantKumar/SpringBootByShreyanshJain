package com.thecodeexperience.TransactionLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class SupportsPropagationPractice {

    @Autowired
    private Method2Service method2Service;

    //@Transactional
    public void supportsPropagationMethod1(){
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
        method2Service.supportsPropagationMethod2();
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
    }
}
