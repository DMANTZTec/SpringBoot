package com.javatechie.jpa.repository;

import com.javatechie.jpa.dto.OrderResponse;
import com.javatechie.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	   @Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")


  // @Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name, p.productName, t.type) FROM Customer c, Product p, Type t JOIN c.products p JOIN p.types t")
	//@Query(value="SELECT new com.javatechie.jpa.dto.OrderResponse( c.id,c.name,p.pid,p.product_name) FROM customer c JOIN product p on p.cp_fk=c.id",nativeQuery=true)
    public List<OrderResponse> getJoinInformation();
}
