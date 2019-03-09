package javaCorePractice.patterns.factoryMethod;

public abstract class Creator {
    private Product lastProduced;

    public String getLastProductInfo() {
        if(lastProduced !=  null) {
            return lastProduced.toString();
        }
        return "Nothing is created";
    };

    abstract Product createProduct();

    public Product createWithLink() {
        lastProduced = createProduct();
        return lastProduced;
    }
}
