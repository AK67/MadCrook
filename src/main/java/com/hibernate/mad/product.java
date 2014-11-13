package com.hibernate.mad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Product")
public class product {
  @Id @GeneratedValue 
  private long id; 
  @NotEmpty
  private String name;
  
  private double price;
  public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
return "ProductController [id=" + id + ", name=" + name + ", price=" + price + "]";
}

}