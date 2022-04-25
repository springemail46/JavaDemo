package main.java.LambdaExpressionDemo;

public interface DefaultInterface {

    default void show()
    {
        System.out.println("Hello This is default method ");
    }
    static void display(){
        System.out.println("Hello This is static method ");
    }

}
