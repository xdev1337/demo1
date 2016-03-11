package com.company.demo1.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.company.demo1.dal.RegionDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * Region
 */
@DAO(daoClass = RegionDAO.class)
@Caption("{%regionDescription}")
@Entity
@Table(name = "Region", catalog = "phIOnbV")
public class Region implements java.io.Serializable {

	private int regionId;
	private String regionDescription;
	private Set<Territories> territories = new HashSet<Territories>(0);

	public Region() {
	}

	public Region(int regionId, String regionDescription) {
		this.regionId = regionId;
		this.regionDescription = regionDescription;
	}

	public Region(int regionId, String regionDescription, Set<Territories> territories) {
		this.regionId = regionId;
		this.regionDescription = regionDescription;
		this.territories = territories;
	}

	@Caption("RegionId")
	@Id

	@Column(name = "RegionID", unique = true, nullable = false)
	public int getRegionId() {
		return this.regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	@Caption("RegionDescription")
	@Column(name = "RegionDescription", nullable = false, length = 50)
	public String getRegionDescription() {
		return this.regionDescription;
	}

	public void setRegionDescription(String regionDescription) {
		this.regionDescription = regionDescription;
	}

	@Caption("Territories")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "region")
	public Set<Territories> getTerritories() {
		return this.territories;
	}

	public void setTerritories(Set<Territories> territories) {
		this.territories = territories;
	}

}
