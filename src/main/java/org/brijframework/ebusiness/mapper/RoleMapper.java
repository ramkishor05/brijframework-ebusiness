package org.brijframework.ebusiness.mapper;

import org.brijframework.ebusiness.dto.EORoleDTO;
import org.brijframework.ebusiness.modal.EORole;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage = "org.brijframework.ebusiness.mapper.impl")
public interface RoleMapper extends GenericMapper<EORole, EORoleDTO>{

}
