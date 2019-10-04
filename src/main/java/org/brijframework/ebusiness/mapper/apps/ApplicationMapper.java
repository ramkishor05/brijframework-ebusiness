package org.brijframework.ebusiness.mapper.apps;

import org.brijframework.ebusiness.dto.apps.EOApplicationDTO;
import org.brijframework.ebusiness.mapper.GenericMapper;
import org.brijframework.ebusiness.modal.apps.EOApplication;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage = "org.brijframework.ebusiness.mapper.impl")
public interface ApplicationMapper extends GenericMapper<EOApplication,EOApplicationDTO>{

}
