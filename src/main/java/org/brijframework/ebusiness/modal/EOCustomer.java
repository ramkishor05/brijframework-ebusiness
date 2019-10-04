package org.brijframework.ebusiness.modal;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.brijframework.ebusiness.modal.custs.EOVendorApplication;

@Entity
@Table(name="VENDOR_INFO")
public class EOCustomer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	
	@Column(name="NAME")
	private String name;
	
	@OneToMany(mappedBy="vendor")
	private List<EOVendorApplication> applications;

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

	public List<EOVendorApplication> getApplications() {
		return applications;
	}

	public void setApplications(List<EOVendorApplication> applications) {
		this.applications = applications;
	}
	
}
