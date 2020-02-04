package com.stream.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuildingApp {

	public static void main(String[] args) {

		System.out.println("_________________________________________________");
		System.out.println("Creating a Stream with initial values");
		System.out.println("_________________________________________________");
		
		Stream<Integer> streamInts = Stream.of(158,22,330,184,50,16,79,18,39);
		streamInts.forEach(e -> System.out.println(e));
		System.out.println("");
		
		System.out.println("_________________________________________________");
		System.out.println("Creating a Stream with an initial array of integers");
		System.out.println("_________________________________________________");
        
		Stream<Integer> streamIntArray = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        streamIntArray.forEach(e -> System.out.println(e));
        System.out.println("");
        
        System.out.println("_________________________________________________");
		System.out.println("Creating a Stream from a List");
		System.out.println("_________________________________________________");
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> streamList = list.stream();
        streamList.forEach(e -> System.out.println(e));
		
        System.out.println("_________________________________________________");
		System.out.println("Create Stream from String Tokens");
		System.out.println("_________________________________________________");
        
        Stream<String> streamTokens = Stream.of("A$B$C$D$E".split("\\$"));
        streamTokens.forEach(e -> System.out.println(e));
        
        System.out.println("_________________________________________________");
		System.out.println("Converting Stream to List Using Stream.filter() && Stream.collect()");
		System.out.println("_________________________________________________");
		
		List<Integer> listIntegers = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            listIntegers.add(i);
        }
        
        Stream<Integer> streamFromList = list.stream();
        List<Integer> evenNumbersList = streamFromList
        									.filter(i -> i%2 == 0)
        									.collect(Collectors.toList());
        
        System.out.print(evenNumbersList);
        System.out.println();
        
        
        System.out.println("_________________________________________________");
		System.out.println("Converting Stream to Array Using Stream.filter() && Stream.toArray()");
		System.out.println("_________________________________________________");
		
        List<Integer> intsArrayList = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            intsArrayList.add(i);
        }
        
        Stream<Integer> streamFromArrayList = list.stream();
        Integer[] evenNumbersArr = streamFromArrayList.filter(i -> i%2 == 0)
        								  .toArray(Integer[]::new);
        
        for(Integer i : evenNumbersArr) {
        	System.out.println(i);
        }
        
        
        
	}

}
