package com.company.functionalProgramming.stream.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = list.stream().map(x -> x*10);
        System.out.println(Arrays.toString(st1.toArray())); // terminal method toArray

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x+2); //Begins in zero and goes to infinite, but it's only
        // consumed when is used on the sysOut
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1] , p[0] + p[1]}).map(p -> p[0]); //Fibonacci
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}
