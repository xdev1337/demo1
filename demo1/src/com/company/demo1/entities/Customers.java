package com.company.demo1.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.company.demo1.dal.CustomersDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * Customers
 */
@DAO(daoClass = CustomersDAO.class)
@Caption("{%customerId}")
@Entity
@Table(name = "Customers", catalog = "phIOnbV")
public class Customers implements java.io.Serializable {

	private String customerId;
	private String companyName;
	private String contactName;
	private String contactTitle;
	private String address;
	private String city;
	private String region;
	private String postalCode;
	private String country;
	private String phone;
	private String fax;
	private Set<Orders> orders = new HashSet<Orders>(0);
	private Set<CustomerDemographics> customerDemographics = new HashSet<CustomerDemographics>(0);

	public Customers() {
	}

	public Customers(String customerId, String companyName) {
		this.customerId = customerId;
		this.companyName = companyName;
	}

	public Customers(String customerId, String companyName, String contactName, String contactTitle, String address,
			String city, String region, String postalCode, String country, String phone, String fax, Set<Orders> orders,
			Set<CustomerDemographics> customerDemographics) {
		this.customerId = customerId;
		this.companyName = companyName;
		this.contactName = contactName;
		this.contactTitle = contactTitle;
		this.address = address;
		this.city = city;
		this.region = region;
		this.postalCode = postalCode;
		this.country = country;
		this.phone = phone;
		this.fax = fax;
		this.orders = orders;
		this.customerDemographics = customerDemographics;
	}

	@Caption("CustomerId")
	@Id

	@Column(name = "CustomerID", unique = true, nullable = false, length = 5)
	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Caption("CompanyName")
	@Column(name = "CompanyName", nullable = false, length = 40)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Caption("ContactName")
	@Column(name = "ContactName", length = 30)
	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Caption("ContactTitle")
	@Column(name = "ContactTitle", length = 30)
	public String getContactTitle() {
		return this.contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	@Caption("Address")
	@Column(name = "Address", length = 60)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Caption("City")
	@Column(name = "City", length = 15)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Caption("Region")
	@Column(name = "Region", length = 15)
	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Caption("PostalCode")
	@Column(name = "PostalCode", length = 10)
	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Caption("Country")
	@Column(name = "Country", length = 15)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Caption("Phone")
	@Column(name = "Phone", length = 24)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Caption("Fax")
	@Column(name = "Fax", length = 24)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Caption("Orders")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customers")
	public Set<Orders> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

	@Caption("CustomerDemographics")
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "CustomerCustomerDemo", catalog = "phIOnbV", joinColumns = {
			@JoinColumn(name = "CustomerID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "CustomerTypeID", nullable = false, updatable = false) })
	public Set<CustomerDemographics> getCustomerDemographics() {
		return this.customerDemographics;
	}

	public void setCustomerDemographics(Set<CustomerDemographics> customerDemographics) {
		this.customerDemographics = customerDemographics;
	}

}
