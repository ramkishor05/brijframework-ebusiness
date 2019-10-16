package org.brijframework.ebusiness.dto;

import lombok.Data;

@Data
public class EOUserProfileDTO {

	private long id;
	private String title;
	private String firstName;
	private String lastName;
	private String preferredName;
	private String pictureURL;
}
