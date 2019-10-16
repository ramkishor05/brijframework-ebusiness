package org.brijframework.ebusiness.modal.supplier;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUPPLIER_APP_EDITON")
public class EOSupplierAppEdition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@ManyToOne
	@JoinColumn(name = "SUPPLIER_ID")
	private EOSupplier supplier;

	@ManyToOne
	@JoinColumn(name = "SUPPLIER_APP_ID")
	private EOSupplierApplication supplierApp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EOSupplier getSupplier() {
		return supplier;
	}

	public void setSupplier(EOSupplier supplier) {
		this.supplier = supplier;
	}

	public EOSupplierApplication getSupplierApp() {
		return supplierApp;
	}

	public void setSupplierApp(EOSupplierApplication supplierApp) {
		this.supplierApp = supplierApp;
	}

}
