package com.singletonpatternexample;

public class Logger{

    // Private Constructor
    private Logger(){}

    // Private static instance member
    private static Logger instance;

    // Public getInstance method to provide the access of the instance 
    public static Logger getInstance(){
        if(instance == null){
            synchronized(Logger.class){
                if(instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    // Example method for logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}


