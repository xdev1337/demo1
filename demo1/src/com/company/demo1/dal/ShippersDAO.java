
package com.company.demo1.dal;

import com.xdev.dal.JPADAO;
import com.company.demo1.entities.Shippers;

/**
 * Home object for domain model class Shippers.
 * 
 * @see Shippers
 */
public class ShippersDAO extends JPADAO<Shippers, Integer> {
	public ShippersDAO() {
		super(Shippers.class);
	}
}