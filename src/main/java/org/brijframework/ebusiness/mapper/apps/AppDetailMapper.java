package org.brijframework.ebusiness.mapper.apps;

import org.brijframework.ebusiness.dto.apps.EOAppDetailDTO;
import org.brijframework.ebusiness.mapper.GenericMapper;
import org.brijframework.ebusiness.modal.apps.EOAppDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationPackage = "org.brijframework.ebusiness.mapper.impl")
public interface AppDetailMapper extends GenericMapper<EOAppDetail,EOAppDetailDTO>{

}
