package io.hedwig.dp.structural.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by patrick on 15/4/6.
 *
 * @version $Id$
 */


public class ProxyClient {
    public static void main(String[] args) {
        Movable car = (Movable) Proxy.newProxyInstance(ProxyClient.class.getClassLoader(),
                new Class[]{Movable.class},new TimeHandler());
        car.move();
    }
}
