package main.java.LambdaExpressionDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<Integer, Double> div = a -> a /2.0;
        System.out.println(div.apply(10));
        /*List<Integer> list = Arrays.asList(1,4,2,6,8,4,2,1);
        System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));*/
    }
}
