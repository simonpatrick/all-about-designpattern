package io.hedwig.hellodesignpattern.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class AbstractFactory {

    public enum Type {
        Java, DesignPattern;
    }

    private static Map<Type, Class<? extends SplitHelloWorldFactory>> map;

    static {
        map = new HashMap<>();
        map.put(Type.Java, JavaSplitHelloWorldFactory.class);
        map.put(Type.DesignPattern, DesignPatternSplitHelloWorldFactory.class);
    }

    public static SplitHelloWorldFactory select(Type type) throws IllegalAccessException, InstantiationException {
        return map.get(type).newInstance();
    }

}
