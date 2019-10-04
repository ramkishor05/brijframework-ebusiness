package org.brijframework.ebusiness.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN_INFO")
public class EOLogin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;
	
	@OneToOne
	@JoinColumn(name = "ROLE_ID")
	private EORole role;

	@OneToOne
	@JoinColumn(name = "VENDOR_ID")
	private EOVendor vendor;

	@OneToOne
	@JoinColumn(name = "CUSTOMER_ID")
	private EOCustomer customer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(EORole role) {
		this.role = role;
	}
	
	public EORole getRole() {
		return role;
	}
	
	public EOVendor getVendor() {
		return vendor;
	}

	public void setVendor(EOVendor vendor) {
		this.vendor = vendor;
	}

	public EOCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(EOCustomer customer) {
		this.customer = customer;
	}

}
