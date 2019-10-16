package org.brijframework.ebusiness.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).paths(PathSelectors.any())
				.build().apiInfo(apiInfo()).securityContexts(Lists.newArrayList(securityContext())).securitySchemes(Lists.newArrayList(apiKey())).forCodeGeneration(true);
	}

	private ApiKey apiKey() {
		return new ApiKey("Authorization", "Authorization", "header");
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder().title("Your REST API").description("Your REST API for web app")
				.version("1.0").termsOfServiceUrl("Terms of service").build();
		return apiInfo;
	}

	@SuppressWarnings("deprecation")
	@Bean
	public SecurityConfiguration security() {
		return new SecurityConfiguration(null, null, null, null, "Bearer access_token", ApiKeyVehicle.HEADER,
				"Authorization", ",");
	}

	private SecurityContext securityContext() {
		return SecurityContext.builder().securityReferences(defaultAuth()).forPaths(PathSelectors.regex("/anyPath.*"))
				.build();
	}

	private List<SecurityReference> defaultAuth() {
		AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
		AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
		authorizationScopes[0] = authorizationScope;
		return Lists.newArrayList(new SecurityReference("AUTHORIZATION", authorizationScopes));
	}
}
