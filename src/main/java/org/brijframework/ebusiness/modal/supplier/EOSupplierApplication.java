package org.brijframework.ebusiness.modal.supplier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.brijframework.ebusiness.modal.apps.EOApplication;

@Entity
@Table(name = "SUPPLIER_APP")
public class EOSupplierApplication implements Serializable {

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
	@JoinColumn(name = "APP_INFO_ID")
	private EOApplication application;

	@OneToMany(mappedBy="supplierApp")
	private List<EOSupplierAppEdition> appEditionList;

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

	public EOApplication getApplication() {
		return application;
	}

	public void setApplication(EOApplication application) {
		this.application = application;
	}

	public List<EOSupplierAppEdition> getAppEditionList() {
		return appEditionList;
	}

	public void setAppEditionList(List<EOSupplierAppEdition> appEditionList) {
		this.appEditionList = appEditionList;
	}

}
