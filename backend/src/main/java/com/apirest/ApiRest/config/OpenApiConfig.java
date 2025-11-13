package com.apirest.ApiRest.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API SGP - Sistema de Gestão de Produtos e Vendas",
                version = "v1.0",
                description = "API REST Swagger com Spring Boot."
        ),
        servers = {
                @Server(url = "", description = "")
        }
)
public class OpenApiConfig {
}
