package com.javaTutorial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
	
	public static void main(String[] args) {
	
	List<String> listFruit = new ArrayList<String>();
		
	listFruit.add("Banana");
	listFruit.add("Apple");
	listFruit.add("Mango");
	listFruit.add("Orange");
	
	//Ascending Order
	List<String> sortedList=listFruit.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(sortedList);
	
	List<String> sortedList1=listFruit.stream().sorted((o1,o2) ->o1.compareTo(o2)).collect(Collectors.toList());
	System.out.println(sortedList1);
	
	List<String> sortedList2=listFruit.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedList2);
	
	//Descending Order
	
	List<String> sortedList3 =listFruit.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(sortedList3);
	
	List<String> sorted4 = listFruit.stream().sorted((o1,o2) -> o1. compareTo(o1)).collect(Collectors.toList());
	System.out.println(sorted4);
	
	//sort employee by salary in ascending order
	
	List<Product> productsList = new ArrayList<Product>();      //Object creation 
	productsList.add(new Product(1,"HP Laptop",25000f));
	productsList.add(new Product(2,"Dell Laptop",30000f));
	productsList.add(new Product(3,"Lenevo Laptop",28000f));
	productsList.add(new Product(4,"Sony Laptop",28000f));
	productsList.add(new Product(5,"Apple Laptop",90000f));
	
	List<Employee> employeesSortedList = employees.stream().sorted(new  Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return 0;
		}
		
	}).collect(Collectors.toList());
}
}