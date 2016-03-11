package com.company.demo1.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.company.demo1.dal.SuppliersDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * Suppliers
 */
@DAO(daoClass = SuppliersDAO.class)
@Caption("{%companyName}")
@Entity
@Table(name = "Suppliers", catalog = "phIOnbV")
public class Suppliers implements java.io.Serializable {

	private int supplierId;
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
	private String homePage;
	private Set<Products> products = new HashSet<Products>(0);

	public Suppliers() {
	}

	public Suppliers(String companyName) {
		this.companyName = companyName;
	}

	public Suppliers(String companyName, String contactName, String contactTitle, String address, String city,
			String region, String postalCode, String country, String phone, String fax, String homePage,
			Set<Products> products) {
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
		this.homePage = homePage;
		this.products = products;
	}

	@Caption("SupplierId")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "SupplierID", unique = true, nullable = false)
	public int getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
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

	@Caption("HomePage")
	@Column(name = "HomePage", length = 16777215, columnDefinition = "mediumtext")
	public String getHomePage() {
		return this.homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	@Caption("Products")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suppliers")
	public Set<Products> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

}
