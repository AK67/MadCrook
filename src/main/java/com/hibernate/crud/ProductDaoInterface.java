package com.hibernate.crud;

import java.util.List;

import com.hibernate.mad.product;

public interface ProductDaoInterface {
	public void insert(product p);
	public List<product> selectAll();
}
