
package com.company.demo1.dal;

import com.xdev.dal.JPADAO;
import com.company.demo1.entities.OrderDetailsId;
import com.company.demo1.entities.OrderDetails;

/**
 * Home object for domain model class OrderDetails.
 * 
 * @see OrderDetails
 */
public class OrderDetailsDAO extends JPADAO<OrderDetails, OrderDetailsId> {
	public OrderDetailsDAO() {
		super(OrderDetails.class);
	}
}