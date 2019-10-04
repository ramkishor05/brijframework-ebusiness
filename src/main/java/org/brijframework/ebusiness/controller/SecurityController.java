package org.brijframework.ebusiness.controller;

import org.brijframework.ebusiness.dto.EOLoginDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("security/")
public class SecurityController {

	@PostMapping("/login")
	public void doLogin(@RequestBody EOLoginDTO eoLogin) {
		
	}
	
	@PostMapping("/register")
	public void doRegister(@RequestBody EOLoginDTO eoLogin) {
		
	}
}
