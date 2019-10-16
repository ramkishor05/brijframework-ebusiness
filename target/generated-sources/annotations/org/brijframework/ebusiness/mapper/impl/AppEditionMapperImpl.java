package org.brijframework.ebusiness.mapper.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.brijframework.ebusiness.dto.apps.EOAppEditionDTO;
import org.brijframework.ebusiness.mapper.apps.AppEditionMapper;
import org.brijframework.ebusiness.modal.apps.EOAppEdition;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-16T15:35:23+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class AppEditionMapperImpl implements AppEditionMapper {

    @Override
    public EOAppEditionDTO mapToDTO(EOAppEdition eoRole) {
        if ( eoRole == null ) {
            return null;
        }

        EOAppEditionDTO eOAppEditionDTO = new EOAppEditionDTO();

        eOAppEditionDTO.setDisplayOrder( eoRole.displayOrder );
        eOAppEditionDTO.setDescription( eoRole.description );
        eOAppEditionDTO.setMonthlyRate( eoRole.monthlyRate );
        eOAppEditionDTO.setStartPayDay( eoRole.startPayDay );
        eOAppEditionDTO.setTrail( eoRole.trail );
        eOAppEditionDTO.setVersion( eoRole.version );

        return eOAppEditionDTO;
    }

    @Override
    public EOAppEdition mapToDAO(EOAppEditionDTO eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        EOAppEdition eOAppEdition = new EOAppEdition();

        eOAppEdition.displayOrder = eoRoleDTO.getDisplayOrder();
        eOAppEdition.description = eoRoleDTO.getDescription();
        eOAppEdition.monthlyRate = eoRoleDTO.getMonthlyRate();
        eOAppEdition.startPayDay = eoRoleDTO.getStartPayDay();
        eOAppEdition.trail = eoRoleDTO.isTrail();
        eOAppEdition.version = eoRoleDTO.getVersion();

        return eOAppEdition;
    }

    @Override
    public List<EOAppEdition> mapToDAO(List<EOAppEditionDTO> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOAppEdition> list = new ArrayList<EOAppEdition>( findAll.size() );
        for ( EOAppEditionDTO eOAppEditionDTO : findAll ) {
            list.add( mapToDAO( eOAppEditionDTO ) );
        }

        return list;
    }

    @Override
    public List<EOAppEditionDTO> mapToDTO(List<EOAppEdition> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<EOAppEditionDTO> list = new ArrayList<EOAppEditionDTO>( eoRoleDTO.size() );
        for ( EOAppEdition eOAppEdition : eoRoleDTO ) {
            list.add( mapToDTO( eOAppEdition ) );
        }

        return list;
    }
}
