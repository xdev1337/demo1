package com.company.demo1.entities;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.company.demo1.dal.EmployeesDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * Employees
 */
@DAO(daoClass = EmployeesDAO.class)
@Caption("{%lastName}")
@Entity
@Table(name = "Employees", catalog = "phIOnbV")
public class Employees implements java.io.Serializable {

	private int employeeId;
	private Employees employees;
	private String lastName;
	private String firstName;
	private String title;
	private String titleOfCourtesy;
	private Date birthDate;
	private Date hireDate;
	private String address;
	private String city;
	private String region;
	private String postalCode;
	private String country;
	private String homePhone;
	private String extension;
	private byte[] photo;
	private String notes;
	private String photoPath;
	private Float salary;
	private Set<Territories> territories = new HashSet<Territories>(0);
	private Set<Orders> orders = new HashSet<Orders>(0);
	private Set<Employees> employees_1 = new HashSet<Employees>(0);

	public Employees() {
	}

	public Employees(String lastName, String firstName, String notes) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.notes = notes;
	}

	public Employees(Employees employees, String lastName, String firstName, String title, String titleOfCourtesy,
			Date birthDate, Date hireDate, String address, String city, String region, String postalCode,
			String country, String homePhone, String extension, byte[] photo, String notes, String photoPath,
			Float salary, Set<Territories> territories, Set<Orders> orders, Set<Employees> employees_1) {
		this.employees = employees;
		this.lastName = lastName;
		this.firstName = firstName;
		this.title = title;
		this.titleOfCourtesy = titleOfCourtesy;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
		this.address = address;
		this.city = city;
		this.region = region;
		this.postalCode = postalCode;
		this.country = country;
		this.homePhone = homePhone;
		this.extension = extension;
		this.photo = photo;
		this.notes = notes;
		this.photoPath = photoPath;
		this.salary = salary;
		this.territories = territories;
		this.orders = orders;
		this.employees_1 = employees_1;
	}

	@Caption("EmployeeId")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "EmployeeID", unique = true, nullable = false)
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Caption("Employees")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ReportsTo")
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@Caption("LastName")
	@Column(name = "LastName", nullable = false, length = 20)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Caption("FirstName")
	@Column(name = "FirstName", nullable = false, length = 10)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Caption("Title")
	@Column(name = "Title", length = 30)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Caption("TitleOfCourtesy")
	@Column(name = "TitleOfCourtesy", length = 25)
	public String getTitleOfCourtesy() {
		return this.titleOfCourtesy;
	}

	public void setTitleOfCourtesy(String titleOfCourtesy) {
		this.titleOfCourtesy = titleOfCourtesy;
	}

	@Caption("BirthDate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BirthDate", length = 19)
	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Caption("HireDate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HireDate", length = 19)
	public Date getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
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

	@Caption("HomePhone")
	@Column(name = "HomePhone", length = 24)
	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	@Caption("Extension")
	@Column(name = "Extension", length = 4)
	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Caption("Photo")
	@Column(name = "Photo", columnDefinition = "longblob")
	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Caption("Notes")
	@Column(name = "Notes", nullable = false, length = 16777215, columnDefinition = "mediumtext")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Caption("PhotoPath")
	@Column(name = "PhotoPath")
	public String getPhotoPath() {
		return this.photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	@Caption("Salary")
	@Column(name = "Salary", precision = 12, scale = 0)
	public Float getSalary() {
		return this.salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Caption("Territories")
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "EmployeeTerritories", catalog = "phIOnbV", joinColumns = {
			@JoinColumn(name = "EmployeeID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "TerritoryID", nullable = false, updatable = false) })
	public Set<Territories> getTerritories() {
		return this.territories;
	}

	public void setTerritories(Set<Territories> territories) {
		this.territories = territories;
	}

	@Caption("Orders")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set<Orders> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

	@Caption("Employees 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set<Employees> getEmployees_1() {
		return this.employees_1;
	}

	public void setEmployees_1(Set<Employees> employees_1) {
		this.employees_1 = employees_1;
	}

}
