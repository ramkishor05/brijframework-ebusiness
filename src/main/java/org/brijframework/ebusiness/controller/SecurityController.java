package org.brijframework.ebusiness.controller;

import org.brijframework.ebusiness.dto.EOVendorDTO;
import org.brijframework.ebusiness.dto.rqrs.LoginRequest;
import org.brijframework.ebusiness.dto.rqrs.LoginResponse;
import org.brijframework.ebusiness.dto.rqrs.RegisterRequest;
import org.brijframework.ebusiness.dto.rqrs.RegisterResponse;
import org.brijframework.ebusiness.enums.UserRole;
import org.brijframework.ebusiness.mapper.UserLoginMapper;
import org.brijframework.ebusiness.mapper.UserProfileMapper;
import org.brijframework.ebusiness.modal.EOUserLogin;
import org.brijframework.ebusiness.modal.EOUserProfile;
import org.brijframework.ebusiness.modal.EOUserRole;
import org.brijframework.ebusiness.repo.UserLoginRepository;
import org.brijframework.ebusiness.repo.UserProfileRepository;
import org.brijframework.ebusiness.repo.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("security/")
public class SecurityController {
	
	@Autowired
	private UserLoginRepository userLoginRepo;
	
	@Autowired
	private UserRoleRepository userRoleRepo;
	
	@Autowired
	private UserProfileRepository userProfileRepo;
	
	@Autowired
	private UserLoginMapper userLoginMapper;
	
	@Autowired
	private UserProfileMapper userProfileMapper;
	
	@PostMapping("/login")
	public LoginResponse doLogin(@RequestBody LoginRequest loginRequest) {
		LoginResponse response=new LoginResponse();
		
		return response;
	}
	
	@PostMapping("/register")
	public RegisterResponse doRegister(@RequestBody RegisterRequest registerRequest) {
		EOUserProfile eoUserProfile=userProfileMapper.mapToDAO(registerRequest.getUserProfile());
		userProfileRepo.save(eoUserProfile);
		EOUserLogin eoUserLogin=userLoginMapper.getLoginUserRegisterRequest(registerRequest);
		eoUserLogin.setUserProfile(eoUserProfile);
		EOUserRole userRole=userRoleRepo.findByRoleName(UserRole.OWNER.getRole());
		eoUserLogin.setUserRole(userRole);
		userLoginRepo.save(eoUserLogin);
		return userLoginMapper.getLoginUserRegisterResponse(eoUserLogin);
	}
	
	public EOVendorDTO addVendor(EOUserLogin eoUserLogin) {
		return null;
	}
	
}
