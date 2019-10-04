package org.brijframework.ebusiness.modal.custs;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.brijframework.ebusiness.modal.EOVendor;
import org.brijframework.ebusiness.modal.apps.EOAppEdition;
import org.brijframework.ebusiness.modal.apps.EOApplication;

@Entity
@Table(name = "VENDOR_APP")
public class EOVendorApplication implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@ManyToOne
	@JoinColumn(name="VENDOR_ID")
	private EOVendor vendor;

	@ManyToOne
	@JoinColumn(name="APP_ID")
	private EOApplication application;

	@ManyToOne
	@JoinColumn(name="EDITION_ID")
	private EOAppEdition appEdition;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EOVendor getVendor() {
		return vendor;
	}

	public void setVendor(EOVendor vendor) {
		this.vendor = vendor;
	}

	public EOApplication getApplication() {
		return application;
	}

	public void setApplication(EOApplication application) {
		this.application = application;
	}

	public EOAppEdition getAppEdition() {
		return appEdition;
	}

	public void setAppEdition(EOAppEdition appEdition) {
		this.appEdition = appEdition;
	}

}
