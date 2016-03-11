
package com.company.demo1.dal;

import com.company.demo1.entities.Customers;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Customers.
 * 
 * @see Customers
 */
public class CustomersDAO extends JPADAO<Customers, String> {
	public CustomersDAO() {
		super(Customers.class);
	}
}