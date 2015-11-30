package io.hedwig.hellodesignpattern;

import io.hedwig.hellodesignpattern.behavioral.chainOfResponsibility.HelloWorldHandler;
import io.hedwig.hellodesignpattern.behavioral.chainOfResponsibility.HelloWorldInterjectionHandler;
import io.hedwig.hellodesignpattern.behavioral.chainOfResponsibility.HelloWorldObjectHandler;
import io.hedwig.hellodesignpattern.behavioral.command.Command;
import io.hedwig.hellodesignpattern.behavioral.command.HelloWorldPrintCommand;
import io.hedwig.hellodesignpattern.behavioral.interpreter.HelloWorldInterpreter;
import io.hedwig.hellodesignpattern.behavioral.iterator.HelloWorldCharacterIterator;
import io.hedwig.hellodesignpattern.behavioral.mediator.HelloWorldInterjection;
import io.hedwig.hellodesignpattern.behavioral.mediator.HelloWorldMediator;
import io.hedwig.hellodesignpattern.behavioral.mediator.HelloWorldObject;
import io.hedwig.hellodesignpattern.behavioral.memeto.HelloWorldMementoOriginator;
import io.hedwig.hellodesignpattern.behavioral.observer.HelloWorldObserver;
import io.hedwig.hellodesignpattern.behavioral.observer.Subject;
import io.hedwig.hellodesignpattern.behavioral.state.HelloWorldStateContext;
import io.hedwig.hellodesignpattern.behavioral.strategy.DesignPatternHelloWorldStrategy;
import io.hedwig.hellodesignpattern.behavioral.strategy.HelloWorldStrategyContext;
import io.hedwig.hellodesignpattern.behavioral.template_method.TemplateMethodHelloWorld;
import io.hedwig.hellodesignpattern.behavioral.vistor.HelloWorldCharacterElements;
import io.hedwig.hellodesignpattern.behavioral.vistor.HelloWorldCharacterVisitor;
import io.hedwig.hellodesignpattern.creational.abstractfactory.AbstractFactory;
import io.hedwig.hellodesignpattern.creational.abstractfactory.SplitHelloWorldFactory;
import io.hedwig.hellodesignpattern.creational.builder.HelloWorldBuilder;
import io.hedwig.hellodesignpattern.creational.factorymethod.FactoryMethodHelloWorldFactory;
import io.hedwig.hellodesignpattern.creational.prototype.HelloWorldPrototype;
import io.hedwig.hellodesignpattern.creational.singleton.HelloWorldSingleton;
import io.hedwig.hellodesignpattern.structural.adaptor.HelloAdapterDesignPattern;
import io.hedwig.hellodesignpattern.structural.adaptor.HelloWorldAdapter;
import io.hedwig.hellodesignpattern.structural.bridge.DesignPatternWorldImpl;
import io.hedwig.hellodesignpattern.structural.bridge.HelloWorldBridge;
import io.hedwig.hellodesignpattern.structural.composite.CompositeHelloWorld;
import io.hedwig.hellodesignpattern.structural.decorator.HelloWorldDecorator;
import io.hedwig.hellodesignpattern.structural.facade.HelloWorldFacade;
import io.hedwig.hellodesignpattern.structural.flyweight.HelloWorldFlyWeightFactory;
import io.hedwig.hellodesignpattern.structural.proxy.HelloWorldProxy;

/**
 * Created by patrick on 15/11/30.
 */
public class HelloMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        System.out.println("1. Abstract Factory: ");

        SplitHelloWorldFactory abstractFactory = AbstractFactory.select(AbstractFactory.Type.DesignPattern);
        HelloWorld abstractFactoryHelloWorld = new SplitHelloWorld(abstractFactory.createHelloWorldInterjection(),
                abstractFactory.createHelloWorldObject());
        System.out.println(abstractFactoryHelloWorld.helloWorld());


        System.out.println("2. Builder: ");
        HelloWorld builderHelloWorld = HelloWorldBuilder.builder()
                .interjection("Hello")
                .object("Builder").getHelloWorld();
        System.out.println(builderHelloWorld.helloWorld());


        System.out.println("3. Factory Method: ");
        /**
         * Difference between "abstract factory" and "factory method" is the abstracting point:
         *  1. Abstracting point of abstract factory is factory.
         *  2. Abstracting point of factory method is generated object.
         */
        FactoryMethodHelloWorldFactory factoryMethodHelloWorldFactory = new FactoryMethodHelloWorldFactory();
        HelloWorld factoryMethodHelloWorld = factoryMethodHelloWorldFactory.createHelloWorld();
        System.out.println(factoryMethodHelloWorld.helloWorld());


        System.out.println("4. Prototype: ");
        HelloWorld prototypeHelloWorld = HelloWorldPrototype.PROTOTYPE.clone();
        System.out.println(prototypeHelloWorld.helloWorld());

        System.out.println("5. Singleton: ");
        HelloWorld singletonHelloWorld = HelloWorldSingleton.instance();
        System.out.println(singletonHelloWorld.helloWorld());

        System.out.println("6. Adapter: ");
        HelloWorld adapterHelloWorld = new HelloWorldAdapter(new HelloAdapterDesignPattern());
        System.out.println(adapterHelloWorld.helloWorld());

        System.out.println("7. Bridge: ");
        HelloWorld bridgeHelloWorld = new HelloWorldBridge(new DesignPatternWorldImpl());

        System.out.println("8. Composite: ");
        HelloWorld compositeHelloWorld = new CompositeHelloWorld(bridgeHelloWorld, new CompositeHelloWorld.DefaultHelloWorld());
        System.out.println(compositeHelloWorld.helloWorld());

        System.out.println("9. Decorator: ");
        HelloWorldDecorator decoratorHelloWorld = new HelloWorldDecorator(new HelloWorldDecorator.DefaultHelloWorld());
        System.out.println(decoratorHelloWorld.helloDecorator());

        System.out.println("10. Facade: ");
        HelloWorld facadeHelloWorld = HelloWorldFacade.instance().facadeHelloWorld();
        System.out.println(facadeHelloWorld.helloWorld());

        System.out.println("11. Flyweight: ");
        HelloWorld flyWeightHelloWorld = HelloWorldFlyWeightFactory.instance().createHelloWorld("Hello Flyweight!");
        System.out.println(flyWeightHelloWorld.helloWorld());

        System.out.println("12. Proxy: ");
        HelloWorld proxyHelloWorld = new HelloWorldProxy(new HelloWorldProxy.DefaultHelloWorld());
        System.out.println(proxyHelloWorld.helloWorld());

        System.out.println("13. Chain of Responsibility: ");
        HelloWorldHandler helloWorldChainOfResponsibility =
                new HelloWorldInterjectionHandler()
                        .setNext(new HelloWorldObjectHandler());
        System.out.println(helloWorldChainOfResponsibility.helloWorld());

        System.out.println("14. Command: ");
        Command helloWorldCommand = new HelloWorldPrintCommand();
        helloWorldCommand.execute();

        System.out.println("15. Interpreter: ");
        HelloWorldInterpreter helloWorldInterpreter = new HelloWorldInterpreter();
        helloWorldInterpreter.interpret("println('Hello Interpreter!')");

        System.out.println("16. Iterator: ");
        HelloWorldCharacterIterator helloWorldCharacterIterator = new HelloWorldCharacterIterator("Hello Iterator!".toCharArray());
        while (helloWorldCharacterIterator.hasNext()) {
            System.out.print(helloWorldCharacterIterator.next());
        }
        System.out.println();

        System.out.println("17. Mediator: ");
        HelloWorldInterjection helloWorldInterjection = new HelloWorldInterjection();
        HelloWorldObject helloWorldObject = new HelloWorldObject();
        HelloWorldMediator helloWorldMediator = new HelloWorldMediator(helloWorldInterjection, helloWorldObject);
        helloWorldInterjection.setHelloWorldMediator(helloWorldMediator);
        helloWorldObject.setHelloWorldMediator(helloWorldMediator);
        System.out.println(helloWorldObject.helloWorld());

        System.out.println("18. Memento: ");
        HelloWorldMementoOriginator helloWorldMementoOriginator = new HelloWorldMementoOriginator();
        HelloWorldMementoOriginator.Memento memento = helloWorldMementoOriginator.set("Hello Memento!").saveToMemento();
        helloWorldMementoOriginator.set("Hello Whatever!");
        helloWorldMementoOriginator.restoreFromMemento(memento);
        System.out.println(helloWorldMementoOriginator.helloWorld());

        System.out.println("19. Observer: ");
        Subject subject = new Subject().attach(new HelloWorldObserver());
        subject.notifyObservers();

        System.out.println("20. State: ");
        HelloWorldStateContext helloWorldStateContext = new HelloWorldStateContext();
        HelloWorld stateHelloWorld = helloWorldStateContext.appendWord("Hello").appendWord("State");
        System.out.println(stateHelloWorld.helloWorld());

        System.out.println("21. Strategy: ");
        HelloWorldStrategyContext helloWorldStrategyContext = new HelloWorldStrategyContext(new DesignPatternHelloWorldStrategy());
        System.out.println(helloWorldStrategyContext.helloWorld());

        System.out.println("22. Template Method: ");
        HelloWorld templateMethodHelloWorld = new TemplateMethodHelloWorld();
        System.out.println(templateMethodHelloWorld.helloWorld());

        System.out.println("23. Visitor: ");
        HelloWorldCharacterElements helloWorldCharacterElements = new HelloWorldCharacterElements("Hello Visitor!".toCharArray());
        HelloWorldCharacterVisitor helloWorldCharacterVisitor = new HelloWorldCharacterVisitor();
        helloWorldCharacterElements.accept(helloWorldCharacterVisitor);
        System.out.println(helloWorldCharacterVisitor.helloWorld());


    }
}
