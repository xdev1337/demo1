package com.company.demo1.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.company.demo1.dal.CustomerDemographicsDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * CustomerDemographics
 */
@DAO(daoClass = CustomerDemographicsDAO.class)
@Caption("{%customerTypeId}")
@Entity
@Table(name = "CustomerDemographics", catalog = "phIOnbV")
public class CustomerDemographics implements java.io.Serializable {

	private String customerTypeId;
	private String customerDesc;
	private Set<Customers> customers = new HashSet<Customers>(0);

	public CustomerDemographics() {
	}

	public CustomerDemographics(String customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	public CustomerDemographics(String customerTypeId, String customerDesc, Set<Customers> customers) {
		this.customerTypeId = customerTypeId;
		this.customerDesc = customerDesc;
		this.customers = customers;
	}

	@Caption("CustomerTypeId")
	@Id

	@Column(name = "CustomerTypeID", unique = true, nullable = false, length = 10)
	public String getCustomerTypeId() {
		return this.customerTypeId;
	}

	public void setCustomerTypeId(String customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	@Caption("CustomerDesc")
	@Column(name = "CustomerDesc", length = 16777215, columnDefinition = "mediumtext")
	public String getCustomerDesc() {
		return this.customerDesc;
	}

	public void setCustomerDesc(String customerDesc) {
		this.customerDesc = customerDesc;
	}

	@Caption("Customers")
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "customerDemographics")
	public Set<Customers> getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set<Customers> customers) {
		this.customers = customers;
	}

}
