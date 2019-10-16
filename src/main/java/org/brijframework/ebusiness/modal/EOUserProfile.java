package org.brijframework.ebusiness.modal;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_PROFILE_INFO")
public class EOUserProfile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "PREFERRED_NAME")
	private String preferredName;
	
	@Column(name = "PIC_URL")
	private String pictureURL;

	@OneToOne(mappedBy = "userProfile")
	private EOUserLogin userDetail;

	@OneToMany(mappedBy="userProfile")
	private List<EOContact> contacts;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPreferredName() {
		return preferredName;
	}

	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

	public EOUserLogin getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(EOUserLogin userDetail) {
		this.userDetail = userDetail;
	}

	public List<EOContact> getContacts() {
		return contacts;
	}

	public void setContacts(List<EOContact> contacts) {
		this.contacts = contacts;
	}

}
