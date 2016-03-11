
package com.company.demo1.dal;

import com.xdev.dal.JPADAO;
import com.company.demo1.entities.Orders;

/**
 * Home object for domain model class Orders.
 * 
 * @see Orders
 */
public class OrdersDAO extends JPADAO<Orders, Integer> {
	public OrdersDAO() {
		super(Orders.class);
	}
}