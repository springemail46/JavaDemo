package main.java.LambdaExpressionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(n -> n % 2==0).collect(Collectors.toList()).forEach(x -> System.out.println(x));

    }
}
