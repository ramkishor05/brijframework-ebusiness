package org.brijframework.ebusiness.mapper;

import org.brijframework.ebusiness.dto.EOUserProfileDTO;
import org.brijframework.ebusiness.modal.EOUserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage = "org.brijframework.ebusiness.mapper.impl")
public interface UserProfileMapper  extends GenericMapper<EOUserProfile, EOUserProfileDTO>{

}
