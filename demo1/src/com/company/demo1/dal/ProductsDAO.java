
package com.company.demo1.dal;

import com.xdev.dal.JPADAO;
import com.company.demo1.entities.Products;

/**
 * Home object for domain model class Products.
 * 
 * @see Products
 */
public class ProductsDAO extends JPADAO<Products, Integer> {
	public ProductsDAO() {
		super(Products.class);
	}
}