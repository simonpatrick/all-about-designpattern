package io.hedwig.dp.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by patrick on 15/4/6.
 *
 * @version $Id$
 */


public class TimeHandler implements InvocationHandler{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start invoke method "+method.getName());
        long startTime = System.currentTimeMillis();
        Object o = method.invoke(proxy,args);
        long endTime = System.currentTimeMillis();
        System.out.printf("total used time for method "+method.getName()
                +"is  "+String.valueOf(endTime-startTime));
        return o;
    }
}
