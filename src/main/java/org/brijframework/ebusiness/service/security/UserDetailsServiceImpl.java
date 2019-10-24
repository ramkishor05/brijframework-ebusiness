package org.brijframework.ebusiness.service.security;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.brijframework.ebusiness.modal.EOUserLogin;
import org.brijframework.ebusiness.repo.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;

	@Autowired
	private UserLoginRepository userLoginRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
		System.out.println(username+"==============="+userLoginRepository.findUserName(username));
		}catch (Exception e) {
			e.printStackTrace();
		}
		Optional<EOUserLogin> findUserLogin = userLoginRepository.findUserName(username);
		if (!findUserLogin.isPresent()) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		org.springframework.security.core.userdetails.User userDetails = new org.springframework.security.core.userdetails.User(findUserLogin.get().getUsername(), bcryptEncoder.encode(findUserLogin.get().getPassword()), getAuthority(findUserLogin.get()));
		return userDetails;
	}

	private Set<SimpleGrantedAuthority> getAuthority(EOUserLogin user) {
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority(user.getUserRole().getRoleID()));
		return authorities;
	}
}
