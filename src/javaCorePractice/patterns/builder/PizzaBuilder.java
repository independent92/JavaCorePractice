package javaCorePractice.patterns.builder;

public interface PizzaBuilder {
    public void addCheese();
    public void addBacon();
    public void addSausage();
    public void addMushrooms();
    public Pizza getPizza();
}
