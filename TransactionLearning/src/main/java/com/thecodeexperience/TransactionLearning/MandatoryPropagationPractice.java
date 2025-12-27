package com.thecodeexperience.TransactionLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class MandatoryPropagationPractice {

    @Autowired
    private Method2Service method2Service;

    //@Transactional
    public void mandatoryPropagationMethod1(){
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
        try {
            method2Service.mandatoryPropagationMethod2();
        } catch (Exception e) {
            System.out.println("Exception occurred "+e);
        }
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
    }
}
