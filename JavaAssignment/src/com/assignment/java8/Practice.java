package com.assignment.java8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {

	  public static void main(String [] args){
		   List<String> names = new ArrayList<String>();
		         
		  names.add("David");
		         
		  names.add("Johnson");
		         
		  names.add("Samontika");
		         
		  names.add("Brijesh");
		         
		  names.add("John");
		         
		         
		  names.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);
		         
		  
		  List<ItemStream> l = new ArrayList<>();
			l.add(new ItemStream(101, "ParleG", LocalDateTime.of(2022, 4, 23, 4, 30), LocalDateTime.of(2023, 4, 23, 4, 30),
					2000));
			l.add(new ItemStream(102, "SunFeast", LocalDateTime.of(2020, 5, 20, 8, 00),
					LocalDateTime.of(2021, 5, 20, 8, 00), 4000));
			l.add(new ItemStream(103, "Monaco", LocalDateTime.of(2021, 7, 21, 7, 20), LocalDateTime.of(2022, 7, 21, 7, 20),
					8000));
			l.add(new ItemStream(104, "Bourbun", LocalDateTime.of(2019, 9, 12, 6, 37), LocalDateTime.of(2020, 9, 12, 6, 37),
					3000));
			l.add(new ItemStream(105, "DairyMilk", LocalDateTime.of(2019, 9, 12, 6, 37),
					LocalDateTime.of(2020, 9, 12, 6, 37), 3000));
			l.add(new ItemStream(106, "Water-Bottle", LocalDateTime.of(2019, 9, 12, 6, 37), null, 10000));
			
			
			System.out.println("Find average of the given price of item");
			
			Double f= l.stream().collect(Collectors.averagingDouble(ItemStream ::getPrice));
			System.out.println(f);
			
			
			System.out.println("Find the highest price of the given item");
			
			Optional<ItemStream> d= l.stream().collect(Collectors.maxBy(Comparator.comparingDouble(ItemStream::getPrice)));
			
			System.out.println(d);
			
			System.out.println("Find the lowest price of the given item");
			
			Optional<ItemStream> f1=l.stream().collect(Collectors.minBy(Comparator.comparingDouble(ItemStream::getPrice)));
			System.out.println(f1);
			
			
			
		}
}

