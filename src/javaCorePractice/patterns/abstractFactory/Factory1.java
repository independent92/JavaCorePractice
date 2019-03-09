package javaCorePractice.patterns.abstractFactory;

import javaCorePractice.patterns.factoryMethod.ConcreteCreator1;
import javaCorePractice.patterns.factoryMethod.ConcreteCreator2;
import javaCorePractice.patterns.factoryMethod.Product;

public class Factory1 extends AbstractFactory {
    private ConcreteCreator1 creator1 = new ConcreteCreator1();
    private ConcreteCreator2 creator2 = new ConcreteCreator2();

    @Override
    public Product createProduct1() {
        return creator1.createWithLink();
    }

    @Override
    public Product createProduct2() {
        return creator2.createWithLink();
    }
}
