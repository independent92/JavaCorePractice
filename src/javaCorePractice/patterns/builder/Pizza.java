package javaCorePractice.patterns.builder;

import javaCorePractice.patterns.factoryMethod.Product;

public class Pizza implements Product {
    private int doughDepth;
    private int cheeseAmount;
    private int sausageAmount;
    private int baconAmount;
    private int mushroomsAmount;

    public int getDoughDepth() {
        return doughDepth;
    }

    public void setDoughDepth(int doughDepth) {
        this.doughDepth = doughDepth;
    }

    public int getCheeseAmount() {
        return cheeseAmount;
    }

    public void setCheeseAmount(int cheeseAmount) {
        this.cheeseAmount = cheeseAmount;
    }

    public int getSausageAmount() {
        return sausageAmount;
    }

    public void setSausageAmount(int sausageAmount) {
        this.sausageAmount = sausageAmount;
    }

    public int getBaconAmount() {
        return baconAmount;
    }

    public void setBaconAmount(int baconAmount) {
        this.baconAmount = baconAmount;
    }

    public int getMushroomsAmount() {
        return mushroomsAmount;
    }

    public void setMushroomsAmount(int mushroomsAmount) {
        this.mushroomsAmount = mushroomsAmount;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "doughDepth=" + doughDepth +
                ", cheeseAmount=" + cheeseAmount +
                ", sausageAmount=" + sausageAmount +
                ", baconAmount=" + baconAmount +
                ", mushroomsAmount=" + mushroomsAmount +
                '}';
    }

    @Override
    public String doStuff() {
        return "simple Pizza";
    }
}
