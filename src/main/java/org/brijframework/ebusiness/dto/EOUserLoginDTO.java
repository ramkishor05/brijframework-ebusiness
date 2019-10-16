package org.brijframework.ebusiness.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class EOUserLoginDTO {

	private long id;

	private String username;

	private String password;
	
	private EOUserRoleDTO role;
	
	private EOUserTypeDTO type;
}
