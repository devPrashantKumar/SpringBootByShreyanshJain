package com.thecodeexperience.TransactionLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class NeverPropagationPractice {

    @Autowired
    private Method2Service method2Service;

    @Transactional
    public void neverPropagationMethod1(){
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
        try {
            method2Service.neverPropagationMethod2();
        } catch (Exception e) {
            System.out.println("Exception occurred "+e);
        }
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
    }
}
