package org.brijframework.ebusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * EbusinessApplication!
 *
 */
@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
public class EbusinessApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EbusinessApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(EbusinessApplication.class, args);
	}
	
}