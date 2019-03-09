package javaCorePractice.patterns.builder;

public class DoubleCheesePizzaDirector {
    private PizzaBuilder builder;

    public PizzaBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void doDirect() {
        builder.addCheese();
        builder.addCheese();
        builder.addBacon();
        builder.addSausage();
        builder.addMushrooms();
    }

    public static void main(String[] args) {
        PizzaBuilder builder1 = new ThinPizzaBuilder(new Pizza());
        DoubleCheesePizzaDirector director = new DoubleCheesePizzaDirector();
        director.setBuilder(builder1);
        director.doDirect();
        System.out.println(builder1.getPizza());

        PizzaBuilder builder2 = new ThickPizzaBuilder(new Pizza());
        director.setBuilder(builder2);
        director.doDirect();
        System.out.println(builder2.getPizza());
    }
}
