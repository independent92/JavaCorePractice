package javaCorePractice.patterns.factoryMethod;

public class fabricMethod {
    public static void main(String[] args) {
        ConcreteCreator1 creator1 = new ConcreteCreator1();
        Product product1 = creator1.createWithLink();
        System.out.println(creator1.getLastProductInfo());
        System.out.println(product1.doStuff());

        ConcreteCreator2 creator2 = new ConcreteCreator2();
        Product product2 = creator2.createWithLink();
        System.out.println(creator2.getLastProductInfo());
        System.out.println(product2.doStuff());
    }
}
