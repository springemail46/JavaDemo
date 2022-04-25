package main.java.LambdaExpressionDemo;

public class DefaultStaticDemo implements DefaultInterface{

    public static void main(String[] args) {
        DefaultInterface.display();
        DefaultStaticDemo d = new DefaultStaticDemo();
        d.show();
    }
}
