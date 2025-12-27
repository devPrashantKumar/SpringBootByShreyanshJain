package com.thecodeexperience.TransactionLearning;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class Method2Service {

    @Transactional(propagation = Propagation.REQUIRED)
    public void requiredPropagationMethod2(){
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNewPropagationMethod2() {
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void supportsPropagationMethod2() {
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupportedPropagationMethod2() {
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void mandatoryPropagationMethod2() {
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
    }

    @Transactional(propagation = Propagation.NEVER)
    public void neverPropagationMethod2() {
        System.out.println("is Transaction active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("current transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
    }
}
