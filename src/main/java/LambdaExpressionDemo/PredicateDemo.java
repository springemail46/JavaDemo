package main.java.LambdaExpressionDemo;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p = n -> n > 5;
        System.out.println(p.test(8));
    }


}
