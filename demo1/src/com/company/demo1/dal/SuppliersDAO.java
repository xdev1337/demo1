
package com.company.demo1.dal;

import com.company.demo1.entities.Suppliers;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Suppliers.
 * 
 * @see Suppliers
 */
public class SuppliersDAO extends JPADAO<Suppliers, Integer> {
	public SuppliersDAO() {
		super(Suppliers.class);
	}
}