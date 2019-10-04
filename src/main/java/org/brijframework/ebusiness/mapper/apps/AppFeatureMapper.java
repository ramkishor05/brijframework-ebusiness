package org.brijframework.ebusiness.mapper.apps;

import org.brijframework.ebusiness.dto.apps.EOAppFeatureDTO;
import org.brijframework.ebusiness.mapper.GenericMapper;
import org.brijframework.ebusiness.modal.apps.EOAppFeature;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage = "org.brijframework.ebusiness.mapper.impl")
public interface AppFeatureMapper extends GenericMapper<EOAppFeature,EOAppFeatureDTO>{

}
