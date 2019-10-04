package org.brijframework.ebusiness.mapper.apps;

import org.brijframework.ebusiness.dto.apps.EOAppEditionDTO;
import org.brijframework.ebusiness.mapper.GenericMapper;
import org.brijframework.ebusiness.modal.apps.EOAppEdition;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage = "org.brijframework.ebusiness.mapper.impl")
public interface AppEditionMapper extends GenericMapper<EOAppEdition,EOAppEditionDTO>{

}
