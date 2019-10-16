package org.brijframework.ebusiness.modal.cust;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.brijframework.ebusiness.modal.EOUserLogin;

@Entity
@Table(name = "CUSTOMER_INFO")
public class EOCustomer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "NAME")
	private String name;

	@OneToOne
	@JoinColumn(name = "LOGIN_ID")
	private EOUserLogin userLogin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EOUserLogin getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(EOUserLogin userLogin) {
		this.userLogin = userLogin;
	}

}
