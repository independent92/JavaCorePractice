package javaCorePractice.patterns.builder;

public class ThickPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public ThickPizzaBuilder(Pizza pizza) {
        this.pizza = pizza;
        pizza.setDoughDepth(2);
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
