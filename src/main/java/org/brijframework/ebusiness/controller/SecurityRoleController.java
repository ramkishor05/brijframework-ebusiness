package org.brijframework.ebusiness.controller;

import org.brijframework.ebusiness.dto.rqrs.RoleRequest;
import org.brijframework.ebusiness.dto.rqrs.RoleResponse;
import org.brijframework.ebusiness.mapper.RoleMapper;
import org.brijframework.ebusiness.modal.EOUserRole;
import org.brijframework.ebusiness.repo.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("security/role")
public class SecurityRoleController {

	@Autowired
	private UserRoleRepository userRoleRepo;

	@Autowired
	private RoleMapper roleMapper;
	
	@PostMapping
	public RoleResponse addRole(@RequestBody RoleRequest roleRequest) {
		EOUserRole eoUserRole=roleMapper.getUserRole(roleRequest);
		return roleMapper.getRoleResponse(userRoleRepo.save(eoUserRole));
	}
	
	@PutMapping
	public RoleResponse updateRole(@RequestBody RoleRequest roleRequest) {
		EOUserRole eoUserRole=roleMapper.getUserRole(roleRequest);
		return roleMapper.getRoleResponse(userRoleRepo.save(eoUserRole));
	}
	
	@PutMapping("/{id}")
	public RoleResponse findRole(@PathVariable Long id) {
		return roleMapper.getRoleResponse(userRoleRepo.findById(id).orElseGet(null));
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteRole(@PathVariable Long id) {
		userRoleRepo.deleteById(id);
		return true;
	}
}
