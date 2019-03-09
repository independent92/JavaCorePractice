package javaCorePractice.exception;

public class ExceptionStatement {
    public static void main(String[] args) {
        System.out.println(new ExceptionStatement().throwableMethod());
    }

    private String throwableMethod() {
        try {
            //throw any exception
            int i = 1 / 1;
            return "Complete throwableMethod";
        } catch (Exception e) {
            return "Exception catching";
        } finally {
            return "Finally block";
        }
    }
}
