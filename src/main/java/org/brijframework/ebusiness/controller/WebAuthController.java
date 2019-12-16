package org.brijframework.ebusiness.controller;

import org.brijframework.ebusiness.dto.rqrs.LoginRequest;
import org.brijframework.ebusiness.dto.rqrs.LoginResponse;
import org.brijframework.ebusiness.dto.rqrs.RegisterRequest;
import org.brijframework.ebusiness.dto.rqrs.RegisterResponse;
import org.brijframework.ebusiness.dto.rqrs.RoleRequest;
import org.brijframework.ebusiness.dto.rqrs.RoleResponse;
import org.brijframework.ebusiness.enums.UserRole;
import org.brijframework.ebusiness.enums.UserType;
import org.brijframework.ebusiness.mapper.RoleMapper;
import org.brijframework.ebusiness.mapper.UserLoginMapper;
import org.brijframework.ebusiness.mapper.UserProfileMapper;
import org.brijframework.ebusiness.modal.EOUserLogin;
import org.brijframework.ebusiness.modal.EOUserProfile;
import org.brijframework.ebusiness.modal.EOUserRole;
import org.brijframework.ebusiness.modal.cust.EOCustomer;
import org.brijframework.ebusiness.modal.supplier.EOSupplier;
import org.brijframework.ebusiness.modal.vendor.EOVendor;
import org.brijframework.ebusiness.repo.CustomerRepository;
import org.brijframework.ebusiness.repo.SupplierRepository;
import org.brijframework.ebusiness.repo.UserLoginRepository;
import org.brijframework.ebusiness.repo.UserProfileRepository;
import org.brijframework.ebusiness.repo.UserRoleRepository;
import org.brijframework.ebusiness.repo.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("security")
public class WebAuthController {
	
	@Autowired
	private UserLoginRepository userLoginRepo;
	
	@Autowired
	private UserRoleRepository userRoleRepo;
	
	@Autowired
	private UserProfileRepository userProfileRepo;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private VendorRepository vendorRepository;
	
	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired
	private UserLoginMapper userLoginMapper;
	
	@Autowired
	private UserProfileMapper userProfileMapper;
	
	@Autowired
	private RoleMapper roleMapper;
	
	@PostMapping("/login")
	public LoginResponse doLogin(@RequestBody LoginRequest loginRequest) {
		LoginResponse response=new LoginResponse();
		
		return response;
	}
	
	@PostMapping("/register")
	public RegisterResponse doRegister(@RequestBody RegisterRequest registerRequest) {
		UserType type=UserType.find(registerRequest.getType());
		EOUserProfile eoUserProfile=userProfileMapper.mapToDAO(registerRequest.getUserProfile());
		userProfileRepo.save(eoUserProfile);
		EOUserLogin eoUserLogin=userLoginMapper.getLoginUserRegisterRequest(registerRequest);
		eoUserLogin.setUserProfile(eoUserProfile);
		EOUserRole userRole=userRoleRepo.findByRoleName(UserRole.OWNER.getRole());
		eoUserLogin.setUserRole(userRole);
		userLoginRepo.save(eoUserLogin);
		switch(type) {
		case CUSTOMER:
			addCustomer(eoUserLogin);
			break;
		case VENDOR:
			addVendor(eoUserLogin);
			break;
		case SUPPLIER:
			addSupplier(eoUserLogin);
			break;
		default:
			addCustomer(eoUserLogin);
			break;
		}
		
		return userLoginMapper.getLoginUserRegisterResponse(eoUserLogin);
	}
	
	public void addVendor(EOUserLogin eoUserLogin) {
		EOVendor eoVendor=new EOVendor();
		eoVendor.setUserLogin(eoUserLogin);
		vendorRepository.save(eoVendor);
	}
	
	public void addSupplier(EOUserLogin eoUserLogin) {
		EOSupplier eoSupplier=new EOSupplier();
		eoSupplier.setUserLogin(eoUserLogin);
		supplierRepository.save(eoSupplier);
	}
	
	public void addCustomer(EOUserLogin eoUserLogin) {
		EOCustomer customer=new EOCustomer();
		customer.setUserLogin(eoUserLogin);
		customerRepository.save(customer);
	}
	
	@PostMapping("role")
	public RoleResponse addRole(@RequestBody RoleRequest roleRequest) {
		EOUserRole eoUserRole=roleMapper.getUserRole(roleRequest);
		return roleMapper.getRoleResponse(userRoleRepo.save(eoUserRole));
	}
	
	@PutMapping("role")
	public RoleResponse updateRole(@RequestBody RoleRequest roleRequest) {
		EOUserRole eoUserRole=roleMapper.getUserRole(roleRequest);
		return roleMapper.getRoleResponse(userRoleRepo.save(eoUserRole));
	}
	
	@PutMapping("role/{id}")
	public RoleResponse findRole(@PathVariable Long id) {
		return roleMapper.getRoleResponse(userRoleRepo.findById(id).orElseGet(null));
	}
	
	@DeleteMapping("role/{id}")
	public boolean deleteRole(@PathVariable Long id) {
		userRoleRepo.deleteById(id);
		return true;
	}
	
	
}
