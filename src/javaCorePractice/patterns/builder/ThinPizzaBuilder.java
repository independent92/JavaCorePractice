package javaCorePractice.patterns.builder;

public class ThinPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public ThinPizzaBuilder(Pizza pizza) {
        this.pizza = pizza;
        pizza.setDoughDepth(1);
    }

    public void addCheese(){
        int cheeseAmount = pizza.getCheeseAmount();
        pizza.setCheeseAmount(++cheeseAmount);
    };
    public void addBacon() {
        int baconAmount = pizza.getBaconAmount();
        pizza.setBaconAmount(++baconAmount);
    };
    public void addSausage() {
        int sausageAmount = pizza.getSausageAmount();
        pizza.setSausageAmount(++sausageAmount);
    };
    public void addMushrooms() {
        int mushroomsAmount = pizza.getMushroomsAmount();
        pizza.setMushroomsAmount(++mushroomsAmount);
    };

    public Pizza getPizza() {
        return pizza;
    }
}
