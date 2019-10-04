package org.brijframework.ebusiness.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class EOLoginDTO {

	private long id;

	private String username;

	private String password;
	
	private EORoleDTO role;

	private EOVendorDTO vendor;

	private EOCustomerDTO customer;

}
