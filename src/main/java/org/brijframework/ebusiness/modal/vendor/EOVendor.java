package org.brijframework.ebusiness.modal.vendor;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.brijframework.ebusiness.modal.EOUserLogin;

@Entity
@Table(name = "VENDOR_INFO")
public class EOVendor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@OneToOne
	@JoinColumn(name = "USER_ID")
	private EOUserLogin userLogin;

	@OneToMany(mappedBy = "vendor")
	private List<EOVendorApplication> applicationList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EOUserLogin getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(EOUserLogin userLogin) {
		this.userLogin = userLogin;
	}

	public List<EOVendorApplication> getApplicationList() {
		return applicationList;
	}

	public void setApplicationList(List<EOVendorApplication> applicationList) {
		this.applicationList = applicationList;
	}

}
