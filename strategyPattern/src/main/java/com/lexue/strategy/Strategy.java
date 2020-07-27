package com.lexue.strategy;

/**
 * Created by 25610 on 2020/7/27.
 * 策略模式：当有多种算法实现时，使用大量if else 判断来维护很复杂
 * 优点：扩展性好，避免使用大量多重判断
 * 缺点：策略类会很多，所有策略类都需要对外暴露
 *
 * 如果一个系统的策略类大于四个，就使用混合模式，避免策略类膨胀的问题
 *
 * 使用场景：一个系统需要动态的在几种算法中选择一种
 */
public interface Strategy {
    int doOper(int num1,int num2);
}
