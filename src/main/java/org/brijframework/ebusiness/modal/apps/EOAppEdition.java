package org.brijframework.ebusiness.modal.apps;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class EOAppEdition implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	
	@Column(name="DISPLAY_ORDER")
	public double displayOrder;
	
	@Column(name="DESCRIPTION")
	public String description;
	
	@Column(name="RATE")
	public double monthlyRate; 
	
	@Column(name="PAY_DAY")
	public int  startPayDay;
	
	@Column(name="TRAIL")
	public boolean trail;
	
	@Column(name="VERSION")
	public double version;
	
	@ManyToOne
	private EOAppFeature appFeature;

	public EOAppFeature getAppFeature() {
		return appFeature;
	}

	public void setAppFeature(EOAppFeature appFeature) {
		this.appFeature = appFeature;
	}

}
