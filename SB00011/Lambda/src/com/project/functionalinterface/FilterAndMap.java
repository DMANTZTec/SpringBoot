package com.project.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	public int productId;
	public String productName;
	public Double price;
	
 public	Product (int producId,String productName,Double price) {
	 this.productId=producId;
	 this.productName=productName;
	 this.price=price;
	 
 }
	
}
public class FilterAndMap {
	public static void main(String args[]) {
		
		ArrayList<Product> productList=new ArrayList<Product>();
		productList.add(new Product(1,"Apple",25000.0));
		productList.add(new Product(2,"realme6",6000.0));
		productList.add(new Product(3,"Readmi Note3",11000.0));
		productList.add(new Product(4,"Iphone",50000.0));
		productList.add(new Product(5,"Samsung",15000.0));
		
		
		
		
		List<Product>	newproductlist=productList.stream().filter(p->p.price>10000).collect(Collectors.toList());
		
		System.out.println(newproductlist);
		for(Product name: newproductlist) {
			
			if(name.price>10000)
			System.out.println(name.productId+name.productName+name.price);
		}
		
		List<Double> newProductlist=productList.stream()
				.filter(p->(p.price>12000))
		        .map(p->p.price*2)
		        .collect(Collectors.toList());
		System.out.println( newProductlist);
	}

}
