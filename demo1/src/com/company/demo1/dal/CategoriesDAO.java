
package com.company.demo1.dal;

import com.company.demo1.entities.Categories;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Categories.
 * 
 * @see Categories
 */
public class CategoriesDAO extends JPADAO<Categories, Integer> {
	public CategoriesDAO() {
		super(Categories.class);
	}
}