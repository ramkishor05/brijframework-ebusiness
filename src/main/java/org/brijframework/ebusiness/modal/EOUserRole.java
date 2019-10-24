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

@Entity
@Table(name = "USER_ROLE_INFO")
public class EOUserRole implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "POSITION")
	private int position;

	@Column(name = "ROLE_NAME")
	private String roleName;

	@Column(name = "ROLE_ID")
	private String roleID;

	@OneToMany(mappedBy = "userRole")
	private List<EOUserLogin> users;
	
	public EOUserRole() {
	}

	public EOUserRole(int position, String roleName, String roleID) {
		super();
		this.position = position;
		this.roleName = roleName;
		this.roleID = roleID;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public List<EOUserLogin> getUsers() {
		return users;
	}

	public void setUsers(List<EOUserLogin> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "EOUserRole [id=" + id + ", position=" + position + ", roleName=" + roleName + ", roleID=" + roleID;
	}

	
}
