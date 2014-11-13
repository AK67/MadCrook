package com.services;

import java.util.List;

import com.hibernate.mad.product;

public interface ProductService {
	
	public void addProduct(product prod);
	public void updateProduct(product prod);
	public List<product> allProducts();

}
