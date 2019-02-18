package javaCorePractice.nested;

public class Outer {
    private static String CONST = "OUTER_CONST";
    private int i;
    public int j;

    public Outer() {
        InnerStatic.count++;
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        // Доступ к полям внешнего класса
        inner.outer.i = 1;
        inner.outer.j = 2;
        //inner.outer.CONST - compile error
        System.out.println(outer);

        // Вызов родительского метода внутреннего класса
        System.out.println(inner.superPuperMethod());
        // Проверка наследования внутреннего класса
        Inner innerChild = outer.new InnerChild();
        System.out.println(innerChild.superPuperMethod());

        System.out.println(InnerStatic.count);
        System.out.println(InnerStatic.innerStaticMethod());

        // Внутри другого класса содержится экземпляр Inner класса
        Other other = new Other();
        System.out.println(other.inner.superPuperMethod());
    }

    public class Inner extends SuperInner {
        private Outer outer;

        private int x;
        public int y;

        Inner() {
            outer = Outer.this;
        }
    }

    public class InnerChild extends Inner {
        @Override
        public String superPuperMethod() {
            return "superPuperMethod of InnerChild";
        }
    }

    public static class InnerStatic {
        private static int count;
        public static String innerStaticMethod() {
            return "innerStaticMethod";
        }
    }

    @Override
    public String toString() {
        return "Outer{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
