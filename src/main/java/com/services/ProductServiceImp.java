package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.crud.ProductDao;
import com.hibernate.mad.product;


@Service
public class ProductServiceImp implements ProductService {
    @Autowired
	private ProductDao prodDao;
    @Transactional
	public void addProduct(product prod) {
		// TODO Auto-generated method stub
    	prodDao.insert(prod);		
	}
    @Transactional
	public void updateProduct(product prod) {
		// TODO Auto-generated method stub
		
	}
    @Transactional
	public List<product> allProducts() {
		// TODO Auto-generated method stub
		
		return prodDao.selectAll();
	}

}
