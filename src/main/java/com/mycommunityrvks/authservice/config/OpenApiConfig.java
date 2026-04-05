package com.mycommunityrvks.authservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI authServiceOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Auth Service API")
                        .description("Authentication Service for MyCommunityRVKS – manages users and service health")
                        .version("0.0.1-SNAPSHOT")
                        .contact(new Contact()
                                .name("MyCommunityRVKS")
                                .url("https://github.com/mycommunityrvks/auth-service")));
    }
}
