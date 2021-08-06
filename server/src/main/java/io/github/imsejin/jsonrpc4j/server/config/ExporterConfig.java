package io.github.imsejin.jsonrpc4j.server.config;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter;
import com.googlecode.jsonrpc4j.spring.JsonServiceExporter;
import io.github.imsejin.jsonrpc4j.server.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
class ExporterConfig {

    @Bean
    @Primary
    AutoJsonRpcServiceImplExporter autoJsonRpcServiceImplExporter() {
        return new AutoJsonRpcServiceImplExporter();
    }

    @Primary
    @Bean("/apis/users.json")
    JsonServiceExporter jsonServiceExporter(UserService service) {
        JsonServiceExporter exporter = new JsonServiceExporter();
        exporter.setServiceInterface(UserService.class);
        exporter.setService(service);

        return exporter;
    }

}
