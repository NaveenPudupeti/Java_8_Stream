package com.javaTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		for(Product product : getProducts()) {
			if(product.getPrice() > 25000f) {
				list.add(product);
				
			}
			
		}
		
		for(Product product:list) {
			System.out.println(product);
		}
		
		System.out.println("***********************************************************");
		//using stream ApI
		
	 getProducts()
			.stream().filter((product) -> product.getPrice() > 25000f)
			.forEach(System.out::println);
		
	}
	
	private static List<Product>  getProducts(){        //List<Product> is return type   //getProduct is method
		List<Product> productsList = new ArrayList<Product>();      //Object creation 
		productsList.add(new Product(1,"HP Laptop",25000f));
		productsList.add(new Product(2,"Dell Laptop",30000f));
		productsList.add(new Product(3,"Lenevo Laptop",28000f));
		productsList.add(new Product(4,"Sony Laptop",28000f));
		productsList.add(new Product(5,"Apple Laptop",90000f));
		
		return productsList;
	}
	
	}	
	class Product{
		private int id;
		private String name;
		private float price;
		
		public Product(int id, String name, float price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public float getPrice() {
			return price;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
		}
	}

