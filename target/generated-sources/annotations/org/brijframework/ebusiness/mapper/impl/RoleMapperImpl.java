package org.brijframework.ebusiness.mapper.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.brijframework.ebusiness.dto.EORoleDTO;
import org.brijframework.ebusiness.mapper.RoleMapper;
import org.brijframework.ebusiness.modal.EORole;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-03T18:51:54+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public EORoleDTO mapToDTO(EORole eoRole) {
        if ( eoRole == null ) {
            return null;
        }

        EORoleDTO eORoleDTO = new EORoleDTO();

        eORoleDTO.setId( eoRole.getId() );
        eORoleDTO.setPosition( eoRole.getPosition() );
        eORoleDTO.setRoleName( eoRole.getRoleName() );
        eORoleDTO.setRoleID( eoRole.getRoleID() );

        return eORoleDTO;
    }

    @Override
    public EORole mapToDAO(EORoleDTO eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        EORole eORole = new EORole();

        eORole.setId( eoRoleDTO.getId() );
        eORole.setPosition( eoRoleDTO.getPosition() );
        eORole.setRoleName( eoRoleDTO.getRoleName() );
        eORole.setRoleID( eoRoleDTO.getRoleID() );

        return eORole;
    }

    @Override
    public List<EORole> mapToDAO(List<EORoleDTO> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EORole> list = new ArrayList<EORole>( findAll.size() );
        for ( EORoleDTO eORoleDTO : findAll ) {
            list.add( mapToDAO( eORoleDTO ) );
        }

        return list;
    }

    @Override
    public List<EORoleDTO> mapToDTO(List<EORole> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<EORoleDTO> list = new ArrayList<EORoleDTO>( eoRoleDTO.size() );
        for ( EORole eORole : eoRoleDTO ) {
            list.add( mapToDTO( eORole ) );
        }

        return list;
    }
}
