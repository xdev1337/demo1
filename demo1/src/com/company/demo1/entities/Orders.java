package com.company.demo1.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.company.demo1.dal.OrdersDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * Orders
 */
@DAO(daoClass = OrdersDAO.class)
@Caption("{%shipName}")
@Entity
@Table(name = "Orders", catalog = "phIOnbV")
public class Orders implements java.io.Serializable {

	private int orderId;
	private Customers customers;
	private Employees employees;
	private Shippers shippers;
	private Date orderDate;
	private Date requiredDate;
	private Date shippedDate;
	private BigDecimal freight;
	private String shipName;
	private String shipAddress;
	private String shipCity;
	private String shipRegion;
	private String shipPostalCode;
	private String shipCountry;
	private Set<OrderDetails> orderDetails = new HashSet<OrderDetails>(0);

	public Orders() {
	}

	public Orders(Customers customers, Employees employees, Shippers shippers, Date orderDate, Date requiredDate,
			Date shippedDate, BigDecimal freight, String shipName, String shipAddress, String shipCity,
			String shipRegion, String shipPostalCode, String shipCountry, Set<OrderDetails> orderDetails) {
		this.customers = customers;
		this.employees = employees;
		this.shippers = shippers;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.freight = freight;
		this.shipName = shipName;
		this.shipAddress = shipAddress;
		this.shipCity = shipCity;
		this.shipRegion = shipRegion;
		this.shipPostalCode = shipPostalCode;
		this.shipCountry = shipCountry;
		this.orderDetails = orderDetails;
	}

	@Caption("OrderId")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "OrderID", unique = true, nullable = false)
	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Caption("Customers")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CustomerID")
	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	@Caption("Employees")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "EmployeeID")
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@Caption("Shippers")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ShipVia")
	public Shippers getShippers() {
		return this.shippers;
	}

	public void setShippers(Shippers shippers) {
		this.shippers = shippers;
	}

	@Caption("OrderDate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OrderDate", length = 19)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Caption("RequiredDate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RequiredDate", length = 19)
	public Date getRequiredDate() {
		return this.requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	@Caption("ShippedDate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ShippedDate", length = 19)
	public Date getShippedDate() {
		return this.shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	@Caption("Freight")
	@Column(name = "Freight", precision = 10, scale = 4)
	public BigDecimal getFreight() {
		return this.freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	@Caption("ShipName")
	@Column(name = "ShipName", length = 40)
	public String getShipName() {
		return this.shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	@Caption("ShipAddress")
	@Column(name = "ShipAddress", length = 60)
	public String getShipAddress() {
		return this.shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	@Caption("ShipCity")
	@Column(name = "ShipCity", length = 15)
	public String getShipCity() {
		return this.shipCity;
	}

	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	@Caption("ShipRegion")
	@Column(name = "ShipRegion", length = 15)
	public String getShipRegion() {
		return this.shipRegion;
	}

	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}

	@Caption("ShipPostalCode")
	@Column(name = "ShipPostalCode", length = 10)
	public String getShipPostalCode() {
		return this.shipPostalCode;
	}

	public void setShipPostalCode(String shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}

	@Caption("ShipCountry")
	@Column(name = "ShipCountry", length = 15)
	public String getShipCountry() {
		return this.shipCountry;
	}

	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}

	@Caption("OrderDetails")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<OrderDetails> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
