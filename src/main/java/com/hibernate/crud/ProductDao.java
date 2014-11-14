package com.hibernate.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.mad.product;
@Repository
public class ProductDao implements ProductDaoInterface {

	@Autowired
    private SessionFactory sessionFactory;
	
	
	public void insert (product p) {
		sessionFactory.getCurrentSession().save(p);
		

	}

	public List<product> selectAll() {
		Query query;
		query = sessionFactory.getCurrentSession().createQuery(" from product order by id desc");
		List<product> Mylist =	query.list();
		return Mylist;
		
	}
	

}
