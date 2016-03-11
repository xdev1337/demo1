
package com.company.demo1.dal;

import com.xdev.dal.JPADAO;
import com.company.demo1.entities.Region;

/**
 * Home object for domain model class Region.
 * 
 * @see Region
 */
public class RegionDAO extends JPADAO<Region, Integer> {
	public RegionDAO() {
		super(Region.class);
	}
}