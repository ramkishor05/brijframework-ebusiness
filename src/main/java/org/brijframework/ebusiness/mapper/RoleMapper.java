package org.brijframework.ebusiness.mapper;

import org.brijframework.ebusiness.dto.EOUserRoleDTO;
import org.brijframework.ebusiness.dto.rqrs.RoleRequest;
import org.brijframework.ebusiness.dto.rqrs.RoleResponse;
import org.brijframework.ebusiness.modal.EOUserRole;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage = "org.brijframework.ebusiness.mapper.impl")
public interface RoleMapper extends GenericMapper<EOUserRole, EOUserRoleDTO>{

	EOUserRole getUserRole(RoleRequest roleRequest);
	
	RoleResponse getRoleResponse(EOUserRole eoUserRole);

}
