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

import com.company.demo1.dal.ShippersDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * Shippers
 */
@DAO(daoClass = ShippersDAO.class)
@Caption("{%companyName}")
@Entity
@Table(name = "Shippers", catalog = "phIOnbV")
public class Shippers implements java.io.Serializable {

	private int shipperId;
	private String companyName;
	private String phone;
	private Set<Orders> orders = new HashSet<Orders>(0);

	public Shippers() {
	}

	public Shippers(String companyName) {
		this.companyName = companyName;
	}

	public Shippers(String companyName, String phone, Set<Orders> orders) {
		this.companyName = companyName;
		this.phone = phone;
		this.orders = orders;
	}

	@Caption("ShipperId")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ShipperID", unique = true, nullable = false)
	public int getShipperId() {
		return this.shipperId;
	}

	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}

	@Caption("CompanyName")
	@Column(name = "CompanyName", nullable = false, length = 40)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Caption("Phone")
	@Column(name = "Phone", length = 24)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Caption("Orders")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "shippers")
	public Set<Orders> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

}
