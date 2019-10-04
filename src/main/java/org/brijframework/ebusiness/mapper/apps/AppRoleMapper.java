package org.brijframework.ebusiness.mapper.apps;

import org.brijframework.ebusiness.dto.apps.EOAppRoleDTO;
import org.brijframework.ebusiness.mapper.GenericMapper;
import org.brijframework.ebusiness.modal.apps.EOAppRole;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage = "org.brijframework.ebusiness.mapper.impl")
public interface AppRoleMapper extends GenericMapper<EOAppRole,EOAppRoleDTO>{

}
