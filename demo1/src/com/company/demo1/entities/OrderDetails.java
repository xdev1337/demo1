package com.company.demo1.entities;

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.company.demo1.dal.OrderDetailsDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * OrderDetails
 */
@DAO(daoClass = OrderDetailsDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "`Order Details`", catalog = "phIOnbV")
public class OrderDetails implements java.io.Serializable {

	private OrderDetailsId id;
	private Orders orders;
	private Products products;
	private BigDecimal unitPrice;
	private short quantity;
	private double discount;

	public OrderDetails() {
	}

	public OrderDetails(OrderDetailsId id, Orders orders, Products products, BigDecimal unitPrice, short quantity,
			double discount) {
		this.id = id;
		this.orders = orders;
		this.products = products;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.discount = discount;
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "orderId", column = @Column(name = "OrderID", nullable = false) ),
			@AttributeOverride(name = "productId", column = @Column(name = "ProductID", nullable = false) ) })
	public OrderDetailsId getId() {
		return this.id;
	}

	public void setId(OrderDetailsId id) {
		this.id = id;
	}

	@Caption("Orders")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "OrderID", nullable = false, insertable = false, updatable = false)
	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@Caption("Products")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ProductID", nullable = false, insertable = false, updatable = false)
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Caption("UnitPrice")
	@Column(name = "UnitPrice", nullable = false, precision = 10, scale = 4)
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Caption("Quantity")
	@Column(name = "Quantity", nullable = false)
	public short getQuantity() {
		return this.quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

	@Caption("Discount")
	@Column(name = "Discount", nullable = false, precision = 8, scale = 0)
	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
