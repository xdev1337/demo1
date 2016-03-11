package com.company.demo1.entities;

import java.math.BigDecimal;
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

import com.company.demo1.dal.ProductsDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * Products
 */
@DAO(daoClass = ProductsDAO.class)
@Caption("{%productName}")
@Entity
@Table(name = "Products", catalog = "phIOnbV")
public class Products implements java.io.Serializable {

	private int productId;
	private Categories categories;
	private Suppliers suppliers;
	private String productName;
	private String quantityPerUnit;
	private BigDecimal unitPrice;
	private Short unitsInStock;
	private Short unitsOnOrder;
	private Short reorderLevel;
	private boolean discontinued;
	private Set<OrderDetails> orderDetails = new HashSet<OrderDetails>(0);

	public Products() {
	}

	public Products(String productName, boolean discontinued) {
		this.productName = productName;
		this.discontinued = discontinued;
	}

	public Products(Categories categories, Suppliers suppliers, String productName, String quantityPerUnit,
			BigDecimal unitPrice, Short unitsInStock, Short unitsOnOrder, Short reorderLevel, boolean discontinued,
			Set<OrderDetails> orderDetails) {
		this.categories = categories;
		this.suppliers = suppliers;
		this.productName = productName;
		this.quantityPerUnit = quantityPerUnit;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.unitsOnOrder = unitsOnOrder;
		this.reorderLevel = reorderLevel;
		this.discontinued = discontinued;
		this.orderDetails = orderDetails;
	}

	@Caption("ProductId")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ProductID", unique = true, nullable = false)
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Caption("Categories")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CategoryID")
	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	@Caption("Suppliers")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "SupplierID")
	public Suppliers getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(Suppliers suppliers) {
		this.suppliers = suppliers;
	}

	@Caption("ProductName")
	@Column(name = "ProductName", nullable = false, length = 40)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Caption("QuantityPerUnit")
	@Column(name = "QuantityPerUnit", length = 20)
	public String getQuantityPerUnit() {
		return this.quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	@Caption("UnitPrice")
	@Column(name = "UnitPrice", precision = 10, scale = 4)
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Caption("UnitsInStock")
	@Column(name = "UnitsInStock")
	public Short getUnitsInStock() {
		return this.unitsInStock;
	}

	public void setUnitsInStock(Short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	@Caption("UnitsOnOrder")
	@Column(name = "UnitsOnOrder")
	public Short getUnitsOnOrder() {
		return this.unitsOnOrder;
	}

	public void setUnitsOnOrder(Short unitsOnOrder) {
		this.unitsOnOrder = unitsOnOrder;
	}

	@Caption("ReorderLevel")
	@Column(name = "ReorderLevel")
	public Short getReorderLevel() {
		return this.reorderLevel;
	}

	public void setReorderLevel(Short reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	@Caption("Discontinued")
	@Column(name = "Discontinued", nullable = false)
	public boolean isDiscontinued() {
		return this.discontinued;
	}

	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}

	@Caption("OrderDetails")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<OrderDetails> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
