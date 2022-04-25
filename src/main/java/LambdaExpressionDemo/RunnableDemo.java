package main.java.LambdaExpressionDemo;

public class RunnableDemo {

    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable with anonymous");
            }
        };
        Runnable r2 = () -> System.out.println("This is Runnable function class");

        new Thread(run).start();
        new Thread(r2).start();
    }
}
