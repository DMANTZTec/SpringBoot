package com.project.functionalinterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	
	public String ename;
	public int esalary;
	
	public Employee(String name,int salary) {
		
		ename=name;
		esalary=salary;
	}
}


public class FunctionalInterface {
	public static void main(String[] args ) 
	{
		
		ArrayList<Employee> employeelist= new ArrayList<Employee>();
		   employeelist.add(new Employee("Swapna",16000));
		   employeelist.add(new Employee("Kavya",50000));
		   employeelist.add(new Employee("Narender",90000));
		
		   
		   Function<Employee,Integer> fn=e->{
			   int sal=e.esalary;
			   if(sal<=10000 && sal>15000)
				   return sal=sal* 10/100;
			   else if(sal<=15000 && sal>50000)
				   return sal=sal* 20/100;
			   else if(sal<=50000 && sal>90000)
			   return sal=sal*30/100;
			   else
				   return sal=sal*40/100;
			   
				   
		   };
		   
		   
		   Predicate<Integer> pr=b->b>10000;
		   
		   for(Employee emp:employeelist) {
			   int bonus=fn.apply(emp);
			
			  if(pr.test(bonus)) {
			   System.out.println(emp.ename +"-----"+ emp.esalary);
			   System.out.println("Bonus is"+bonus);
			  }
			   
			   
			
		   }
		
		
		
	}
	

}
