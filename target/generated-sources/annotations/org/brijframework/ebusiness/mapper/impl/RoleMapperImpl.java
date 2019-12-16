package org.brijframework.ebusiness.mapper.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.brijframework.ebusiness.dto.EOUserRoleDTO;
import org.brijframework.ebusiness.dto.rqrs.RoleRequest;
import org.brijframework.ebusiness.dto.rqrs.RoleResponse;
import org.brijframework.ebusiness.mapper.RoleMapper;
import org.brijframework.ebusiness.modal.EOUserRole;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-16T20:22:08+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public EOUserRoleDTO mapToDTO(EOUserRole eoRole) {
        if ( eoRole == null ) {
            return null;
        }

        EOUserRoleDTO eOUserRoleDTO = new EOUserRoleDTO();

        return eOUserRoleDTO;
    }

    @Override
    public EOUserRole mapToDAO(EOUserRoleDTO eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        EOUserRole eOUserRole = new EOUserRole();

        return eOUserRole;
    }

    @Override
    public List<EOUserRole> mapToDAO(List<EOUserRoleDTO> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOUserRole> list = new ArrayList<EOUserRole>( findAll.size() );
        for ( EOUserRoleDTO eOUserRoleDTO : findAll ) {
            list.add( mapToDAO( eOUserRoleDTO ) );
        }

        return list;
    }

    @Override
    public List<EOUserRoleDTO> mapToDTO(List<EOUserRole> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<EOUserRoleDTO> list = new ArrayList<EOUserRoleDTO>( eoRoleDTO.size() );
        for ( EOUserRole eOUserRole : eoRoleDTO ) {
            list.add( mapToDTO( eOUserRole ) );
        }

        return list;
    }

    @Override
    public EOUserRole getUserRole(RoleRequest roleRequest) {
        if ( roleRequest == null ) {
            return null;
        }

        EOUserRole eOUserRole = new EOUserRole();

        eOUserRole.setId( roleRequest.getId() );
        eOUserRole.setPosition( roleRequest.getPosition() );
        eOUserRole.setRoleName( roleRequest.getRoleName() );
        eOUserRole.setRoleID( roleRequest.getRoleID() );

        return eOUserRole;
    }

    @Override
    public RoleResponse getRoleResponse(EOUserRole eoUserRole) {
        if ( eoUserRole == null ) {
            return null;
        }

        RoleResponse roleResponse = new RoleResponse();

        roleResponse.setId( eoUserRole.getId() );
        roleResponse.setPosition( eoUserRole.getPosition() );
        roleResponse.setRoleName( eoUserRole.getRoleName() );
        roleResponse.setRoleID( eoUserRole.getRoleID() );

        return roleResponse;
    }
}
