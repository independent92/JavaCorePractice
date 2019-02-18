package javaCorePractice.collections;

import java.util.HashSet;
import java.util.Set;

public class HashCodeTest {
    public static void main(String[] args) {
        Set<Detail> hashSet = new HashSet<>();

        Detail d1 = new Detail("Test1", 1);
        System.out.println(d1.hashCode());
        Detail d2 = new Detail("Test2", 1);
        System.out.println(d2.hashCode());
        Detail d3 = new Detail("Test3", 3);
        System.out.println(d3.hashCode());

        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d3.equals(d1));

        hashSet.add(d1);
        hashSet.add(d2);
        hashSet.add(d3);

        System.out.println(hashSet);

        /** 1. HashSet имеет произвольный порядок, от hashCode() объекта не зависит.
         *  2. HashSet не добавит элемент, если он будет равен одному из его содержимых элементов
         */
        hashSet.forEach(detail -> System.out.println(detail.toString()));

    }
}
