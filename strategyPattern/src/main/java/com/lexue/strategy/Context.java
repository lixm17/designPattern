package com.lexue.strategy;

/**
 * Created by 25610 on 2020/7/27.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execStrategy(int num1,int num2){
        return strategy.doOper(num1, num2);
    }
}
