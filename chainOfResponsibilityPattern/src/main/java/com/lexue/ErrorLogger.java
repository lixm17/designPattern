package com.lexue;

/**
 * Created by 25610 on 2020/7/27.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger:"+message);
    }
}
