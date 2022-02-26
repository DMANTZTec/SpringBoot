package com.javatechie.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {
    @Id
    private int pid;
    private String productName;
    private int qty;
    private int price;
    @OneToMany(targetEntity = Type.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk1",referencedColumnName = "pid")
    private List<Type> types;
}
