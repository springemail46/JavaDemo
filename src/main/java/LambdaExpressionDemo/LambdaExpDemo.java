package main.java.LambdaExpressionDemo;

public class LambdaExpDemo {
    public static void main(String[] args) {
        Anonymous obj = ()->System.out.println("This is anonymous class");
        obj.show();
    }
}
