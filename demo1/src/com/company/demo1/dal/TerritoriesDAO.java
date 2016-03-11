
package com.company.demo1.dal;

import com.xdev.dal.JPADAO;
import com.company.demo1.entities.Territories;

/**
 * Home object for domain model class Territories.
 * 
 * @see Territories
 */
public class TerritoriesDAO extends JPADAO<Territories, String> {
	public TerritoriesDAO() {
		super(Territories.class);
	}
}