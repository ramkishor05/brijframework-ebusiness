package org.brijframework.ebusiness;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class EbusinessApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

	
    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
    	
    }
}