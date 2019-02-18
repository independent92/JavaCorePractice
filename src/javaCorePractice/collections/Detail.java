package javaCorePractice.collections;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

public class Detail {
    @NotNull
    private String name;
    private int number;

    public Detail(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }


    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detail detail = (Detail) o;
        return number == detail.number &&
                Objects.equals(name, detail.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Detail{" +
                "name='" + name + "', " +
                "hashCode()=" + hashCode() +
                '}';
    }
}
