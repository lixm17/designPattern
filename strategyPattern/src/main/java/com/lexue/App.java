package com.lexue;

import com.lexue.strategy.AddOperStrategy;
import com.lexue.strategy.Context;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Context context=new Context(new AddOperStrategy());
        System.out.println("10+5="+context.execStrategy(10,5));

    }
}
