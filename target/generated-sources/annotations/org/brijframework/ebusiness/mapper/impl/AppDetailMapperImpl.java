package org.brijframework.ebusiness.mapper.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.brijframework.ebusiness.dto.apps.EOAppDetailDTO;
import org.brijframework.ebusiness.mapper.apps.AppDetailMapper;
import org.brijframework.ebusiness.modal.apps.EOAppDetail;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-03T18:51:54+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class AppDetailMapperImpl implements AppDetailMapper {

    @Override
    public EOAppDetailDTO mapToDTO(EOAppDetail eoRole) {
        if ( eoRole == null ) {
            return null;
        }

        EOAppDetailDTO eOAppDetailDTO = new EOAppDetailDTO();

        eOAppDetailDTO.setDisplayOrder( eoRole.getDisplayOrder() );
        eOAppDetailDTO.setInternalHost( eoRole.getInternalHost() );
        eOAppDetailDTO.setExternalHost( eoRole.getExternalHost() );
        eOAppDetailDTO.setInternalPort( eoRole.getInternalPort() );
        eOAppDetailDTO.setExternalPort( eoRole.getExternalPort() );

        return eOAppDetailDTO;
    }

    @Override
    public EOAppDetail mapToDAO(EOAppDetailDTO eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        EOAppDetail eOAppDetail = new EOAppDetail();

        eOAppDetail.setDisplayOrder( eoRoleDTO.getDisplayOrder() );
        eOAppDetail.setInternalHost( eoRoleDTO.getInternalHost() );
        eOAppDetail.setExternalHost( eoRoleDTO.getExternalHost() );
        eOAppDetail.setInternalPort( eoRoleDTO.getInternalPort() );
        eOAppDetail.setExternalPort( eoRoleDTO.getExternalPort() );

        return eOAppDetail;
    }

    @Override
    public List<EOAppDetail> mapToDAO(List<EOAppDetailDTO> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOAppDetail> list = new ArrayList<EOAppDetail>( findAll.size() );
        for ( EOAppDetailDTO eOAppDetailDTO : findAll ) {
            list.add( mapToDAO( eOAppDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<EOAppDetailDTO> mapToDTO(List<EOAppDetail> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<EOAppDetailDTO> list = new ArrayList<EOAppDetailDTO>( eoRoleDTO.size() );
        for ( EOAppDetail eOAppDetail : eoRoleDTO ) {
            list.add( mapToDTO( eOAppDetail ) );
        }

        return list;
    }
}
