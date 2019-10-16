package org.brijframework.ebusiness.mapper.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.brijframework.ebusiness.dto.apps.EOAppRoleDTO;
import org.brijframework.ebusiness.mapper.apps.AppRoleMapper;
import org.brijframework.ebusiness.modal.apps.EOAppRole;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-16T15:35:23+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class AppRoleMapperImpl implements AppRoleMapper {

    @Override
    public EOAppRoleDTO mapToDTO(EOAppRole eoRole) {
        if ( eoRole == null ) {
            return null;
        }

        EOAppRoleDTO eOAppRoleDTO = new EOAppRoleDTO();

        return eOAppRoleDTO;
    }

    @Override
    public EOAppRole mapToDAO(EOAppRoleDTO eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        EOAppRole eOAppRole = new EOAppRole();

        return eOAppRole;
    }

    @Override
    public List<EOAppRole> mapToDAO(List<EOAppRoleDTO> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOAppRole> list = new ArrayList<EOAppRole>( findAll.size() );
        for ( EOAppRoleDTO eOAppRoleDTO : findAll ) {
            list.add( mapToDAO( eOAppRoleDTO ) );
        }

        return list;
    }

    @Override
    public List<EOAppRoleDTO> mapToDTO(List<EOAppRole> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<EOAppRoleDTO> list = new ArrayList<EOAppRoleDTO>( eoRoleDTO.size() );
        for ( EOAppRole eOAppRole : eoRoleDTO ) {
            list.add( mapToDTO( eOAppRole ) );
        }

        return list;
    }
}
