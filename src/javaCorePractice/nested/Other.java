package javaCorePractice.nested;

public class Other {
    Outer.Inner inner;
    public Other() {
        // Создание экземляра внутреннего класса
        inner = new Outer().new Inner();
        System.out.println(Outer.InnerStatic.innerStaticMethod());
    }
}
