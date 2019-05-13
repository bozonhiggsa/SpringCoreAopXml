package com.springApp.springIoC;

/**
 Class with methods that use as advices.
 @author Ihor Savchenko
 @version 1.0
 */
public class Logging {

    public void adviceBeforeMethod() {
        System.out.println("Now we are going to initialize developer's profile.");
    }

    public void adviceAfterMethod() {
        System.out.println("Developer's profile has been initialized.");
    }

    public void adviceAfterReturningValue(Object someValue) {
        if(someValue != null){
            System.out.println("Value: " + someValue.toString());
        }
        else{
            System.out.println("Method didn't return any value");
        }
    }

    public void adviceInCaseOfExceptionThrow(BadPerformanceException e) {
        System.out.println("We have an exception here: " + e.toString());
    }
}
