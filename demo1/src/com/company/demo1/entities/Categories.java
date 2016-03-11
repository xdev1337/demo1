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

import com.company.demo1.dal.CategoriesDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * Categories
 */
@DAO(daoClass = CategoriesDAO.class)
@Caption("{%categoryName}")
@Entity
@Table(name = "Categories", catalog = "phIOnbV")
public class Categories implements java.io.Serializable {

	private int categoryId;
	private String categoryName;
	private String description;
	private byte[] picture;
	private Set<Products> products = new HashSet<Products>(0);

	public Categories() {
	}

	public Categories(String categoryName) {
		this.categoryName = categoryName;
	}

	public Categories(String categoryName, String description, byte[] picture, Set<Products> products) {
		this.categoryName = categoryName;
		this.description = description;
		this.picture = picture;
		this.products = products;
	}

	@Caption("CategoryId")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "CategoryID", unique = true, nullable = false)
	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Caption("CategoryName")
	@Column(name = "CategoryName", nullable = false, length = 15)
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Caption("Description")
	@Column(name = "Description", length = 16777215, columnDefinition = "mediumtext")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Caption("Picture")
	@Column(name = "Picture", columnDefinition = "longblob")
	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	@Caption("Products")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<Products> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

}
