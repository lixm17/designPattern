package com.lexue.strategy;

/**
 * Created by 25610 on 2020/7/27.
 */
public class SubOperStrategy implements Strategy {
    @Override
    public int doOper(int num1, int num2) {
        return num1-num2;
    }
}
