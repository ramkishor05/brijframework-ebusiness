package org.brijframework.ebusiness.mapper.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.brijframework.ebusiness.dto.apps.EOApplicationDTO;
import org.brijframework.ebusiness.mapper.apps.ApplicationMapper;
import org.brijframework.ebusiness.modal.apps.EOApplication;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-16T15:35:23+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class ApplicationMapperImpl implements ApplicationMapper {

    @Override
    public EOApplicationDTO mapToDTO(EOApplication eoRole) {
        if ( eoRole == null ) {
            return null;
        }

        EOApplicationDTO eOApplicationDTO = new EOApplicationDTO();

        eOApplicationDTO.setId( eoRole.getId() );
        eOApplicationDTO.setAppID( eoRole.getAppID() );
        eOApplicationDTO.setAppName( eoRole.getAppName() );
        eOApplicationDTO.setAppLogo( eoRole.getAppLogo() );
        eOApplicationDTO.setAppURL( eoRole.getAppURL() );

        return eOApplicationDTO;
    }

    @Override
    public EOApplication mapToDAO(EOApplicationDTO eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        EOApplication eOApplication = new EOApplication();

        eOApplication.setId( eoRoleDTO.getId() );
        eOApplication.setAppID( eoRoleDTO.getAppID() );
        eOApplication.setAppName( eoRoleDTO.getAppName() );
        eOApplication.setAppLogo( eoRoleDTO.getAppLogo() );
        eOApplication.setAppURL( eoRoleDTO.getAppURL() );

        return eOApplication;
    }

    @Override
    public List<EOApplication> mapToDAO(List<EOApplicationDTO> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOApplication> list = new ArrayList<EOApplication>( findAll.size() );
        for ( EOApplicationDTO eOApplicationDTO : findAll ) {
            list.add( mapToDAO( eOApplicationDTO ) );
        }

        return list;
    }

    @Override
    public List<EOApplicationDTO> mapToDTO(List<EOApplication> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<EOApplicationDTO> list = new ArrayList<EOApplicationDTO>( eoRoleDTO.size() );
        for ( EOApplication eOApplication : eoRoleDTO ) {
            list.add( mapToDTO( eOApplication ) );
        }

        return list;
    }
}
