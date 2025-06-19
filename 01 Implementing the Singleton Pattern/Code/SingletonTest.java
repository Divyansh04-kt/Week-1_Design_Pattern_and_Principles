package com.singletonpatternexample;

public class SingletonTest{
    public static void main(String args[]){
        Logger instance1 = Logger.getInstance();
        Logger instance2 = Logger.getInstance();

        // Checking if the instances are same or not
        if(instance1 == instance2) {
        	System.out.println("Logger instances are same.");
        }
        else {
        	System.out.println("Looger instances are not same.");
        }
        
     // Test logging
        instance1.log("This is a test log message.");
        instance2.log("This is another test log message.");
    }
}
