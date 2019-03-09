package javaCorePractice.patterns.factoryMethod;

public class ConcreteCreator1 extends Creator {
    @Override
    Product createProduct() {
        return new Product1();
    }
}
