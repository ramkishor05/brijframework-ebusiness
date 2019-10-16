package org.brijframework.ebusiness.modal.vendor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.brijframework.ebusiness.modal.apps.EOAppEdition;

@Entity
@Table(name = "VENDOR_APP_EDITION")
public class EOVendorAppEdition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@OneToOne
	@JoinColumn(name = "EDITION_ID")
	private EOAppEdition appEdition;

	@OneToOne
	@JoinColumn(name = "VENDOR_APP_ID")
	private EOVendorApplication vendorApp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EOAppEdition getAppEdition() {
		return appEdition;
	}

	public void setAppEdition(EOAppEdition appEdition) {
		this.appEdition = appEdition;
	}

	public EOVendorApplication getVendorApp() {
		return vendorApp;
	}

	public void setVendorApp(EOVendorApplication vendorApp) {
		this.vendorApp = vendorApp;
	}

}
