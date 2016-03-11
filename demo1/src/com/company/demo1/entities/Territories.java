package com.company.demo1.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.company.demo1.dal.TerritoriesDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * Territories
 */
@DAO(daoClass = TerritoriesDAO.class)
@Caption("{%territoryId}")
@Entity
@Table(name = "Territories", catalog = "phIOnbV")
public class Territories implements java.io.Serializable {

	private String territoryId;
	private Region region;
	private String territoryDescription;
	private Set<Employees> employees = new HashSet<Employees>(0);

	public Territories() {
	}

	public Territories(String territoryId, Region region, String territoryDescription) {
		this.territoryId = territoryId;
		this.region = region;
		this.territoryDescription = territoryDescription;
	}

	public Territories(String territoryId, Region region, String territoryDescription, Set<Employees> employees) {
		this.territoryId = territoryId;
		this.region = region;
		this.territoryDescription = territoryDescription;
		this.employees = employees;
	}

	@Caption("TerritoryId")
	@Id

	@Column(name = "TerritoryID", unique = true, nullable = false, length = 20)
	public String getTerritoryId() {
		return this.territoryId;
	}

	public void setTerritoryId(String territoryId) {
		this.territoryId = territoryId;
	}

	@Caption("Region")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "RegionID", nullable = false)
	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Caption("TerritoryDescription")
	@Column(name = "TerritoryDescription", nullable = false, length = 50)
	public String getTerritoryDescription() {
		return this.territoryDescription;
	}

	public void setTerritoryDescription(String territoryDescription) {
		this.territoryDescription = territoryDescription;
	}

	@Caption("Employees")
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "territories")
	public Set<Employees> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employees> employees) {
		this.employees = employees;
	}

}
