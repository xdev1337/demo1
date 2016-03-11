
package com.company.demo1.dal;

import com.xdev.dal.JPADAO;
import com.company.demo1.entities.Employees;

/**
 * Home object for domain model class Employees.
 * 
 * @see Employees
 */
public class EmployeesDAO extends JPADAO<Employees, Integer> {
	public EmployeesDAO() {
		super(Employees.class);
	}
}