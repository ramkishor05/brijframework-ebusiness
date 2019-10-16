package org.brijframework.ebusiness;

import org.brijframework.ebusiness.enums.UserRole;
import org.brijframework.ebusiness.modal.EOUserRole;
import org.brijframework.ebusiness.repo.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class EbusinessApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserRoleRepository userRoleRepo;
	
    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
    	//ApplicationContext applicationContext = event.getApplicationContext();
    	for(UserRole userRole : UserRole.values()) {
    		if(userRoleRepo.findByPosition(userRole.getPosition()) ==null) {
    			userRoleRepo.saveAndFlush(new EOUserRole(userRole.getPosition(),userRole.getRole(),userRole.getRole()));
    		}
    	}
    }
}