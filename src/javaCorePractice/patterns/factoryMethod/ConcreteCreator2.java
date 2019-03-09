package javaCorePractice.patterns.factoryMethod;

public class ConcreteCreator2  extends Creator {
    @Override
    Product createProduct() {
        return new Product2();
    }
}
