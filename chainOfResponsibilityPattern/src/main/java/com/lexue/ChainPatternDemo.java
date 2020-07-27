package com.lexue;

/**
 * Created by 25610 on 2020/7/27.
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger error=new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger file=new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger console=new ConsoleLogger(AbstractLogger.INFO);
        error.setNextLogger(file);
        file.setNextLogger(console);
        return error;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain=getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,"this is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
