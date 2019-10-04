package org.brijframework.ebusiness.mapper.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.brijframework.ebusiness.dto.apps.EOAppFeatureDTO;
import org.brijframework.ebusiness.mapper.apps.AppFeatureMapper;
import org.brijframework.ebusiness.modal.apps.EOAppFeature;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-03T18:51:54+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class AppFeatureMapperImpl implements AppFeatureMapper {

    @Override
    public EOAppFeatureDTO mapToDTO(EOAppFeature eoRole) {
        if ( eoRole == null ) {
            return null;
        }

        EOAppFeatureDTO eOAppFeatureDTO = new EOAppFeatureDTO();

        eOAppFeatureDTO.setDescription( eoRole.getDescription() );
        eOAppFeatureDTO.setDisplayOrder( eoRole.getDisplayOrder() );
        eOAppFeatureDTO.setViewDetail( eoRole.getViewDetail() );

        return eOAppFeatureDTO;
    }

    @Override
    public EOAppFeature mapToDAO(EOAppFeatureDTO eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        EOAppFeature eOAppFeature = new EOAppFeature();

        eOAppFeature.setDescription( eoRoleDTO.getDescription() );
        eOAppFeature.setDisplayOrder( eoRoleDTO.getDisplayOrder() );
        eOAppFeature.setViewDetail( eoRoleDTO.getViewDetail() );

        return eOAppFeature;
    }

    @Override
    public List<EOAppFeature> mapToDAO(List<EOAppFeatureDTO> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOAppFeature> list = new ArrayList<EOAppFeature>( findAll.size() );
        for ( EOAppFeatureDTO eOAppFeatureDTO : findAll ) {
            list.add( mapToDAO( eOAppFeatureDTO ) );
        }

        return list;
    }

    @Override
    public List<EOAppFeatureDTO> mapToDTO(List<EOAppFeature> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<EOAppFeatureDTO> list = new ArrayList<EOAppFeatureDTO>( eoRoleDTO.size() );
        for ( EOAppFeature eOAppFeature : eoRoleDTO ) {
            list.add( mapToDTO( eOAppFeature ) );
        }

        return list;
    }
}
