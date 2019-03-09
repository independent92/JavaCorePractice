package javaCorePractice.patterns.abstractFactory;

import javaCorePractice.patterns.factoryMethod.Product;

public abstract class AbstractFactory {
    public abstract Product createProduct1();
    public abstract Product createProduct2();

    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();

        System.out.println(factory1.createProduct1().doStuff());
        System.out.println(factory1.createProduct2().doStuff());
    }
}
