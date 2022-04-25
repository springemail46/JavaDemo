package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumberOfOccurance {
    public static void main(String[] args) {
       String str = "hello today is my birthday please every one should come to celebrate my birthday welcome to all";
       List<String> list  = Arrays.asList(str.split(" "));
       Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
