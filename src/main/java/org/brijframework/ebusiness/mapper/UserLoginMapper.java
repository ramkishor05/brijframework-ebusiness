package org.brijframework.ebusiness.mapper;

import org.brijframework.ebusiness.dto.EOUserLoginDTO;
import org.brijframework.ebusiness.dto.rqrs.LoginRequest;
import org.brijframework.ebusiness.dto.rqrs.LoginResponse;
import org.brijframework.ebusiness.dto.rqrs.RegisterRequest;
import org.brijframework.ebusiness.dto.rqrs.RegisterResponse;
import org.brijframework.ebusiness.modal.EOUserLogin;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", implementationPackage = "org.brijframework.ebusiness.mapper.impl")
public interface UserLoginMapper extends GenericMapper<EOUserLogin, EOUserLoginDTO>{

	public EOUserLogin getLoginUserLoginRequest(LoginRequest loginRequest);
	
	public LoginResponse getLoginUserLoginResponse(EOUserLogin loginRequest);
	
	public EOUserLogin getLoginUserRegisterRequest(RegisterRequest loginRequest);
	
	@Mapping(source="userRole.roleName", target="role")
	public RegisterResponse getLoginUserRegisterResponse(EOUserLogin loginRequest);
	
}
