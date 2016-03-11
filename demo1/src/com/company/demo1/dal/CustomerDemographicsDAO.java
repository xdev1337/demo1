
package com.company.demo1.dal;

import com.company.demo1.entities.CustomerDemographics;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class CustomerDemographics.
 * 
 * @see CustomerDemographics
 */
public class CustomerDemographicsDAO extends JPADAO<CustomerDemographics, String> {
	public CustomerDemographicsDAO() {
		super(CustomerDemographics.class);
	}
}