package io.github.imsejin.jsonrpc4j.client.config;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.googlecode.jsonrpc4j.ProxyUtil;
import io.github.imsejin.jsonrpc4j.server.service.ProductService;
import io.github.imsejin.jsonrpc4j.server.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
class ServiceConfig {

    @Bean
    @Primary
    ProductService productService() throws MalformedURLException {
        URL url = new URL("http://localhost:8081/apis/products.json");
        JsonRpcHttpClient client = new JsonRpcHttpClient(url);

        return ProxyUtil.createClientProxy(Thread.currentThread().getContextClassLoader(),
                ProductService.class, client);
    }

    @Bean
    @Primary
    UserService userService() throws MalformedURLException {
        URL url = new URL("http://localhost:8081/apis/users.json");
        JsonRpcHttpClient client = new JsonRpcHttpClient(url);

        return ProxyUtil.createClientProxy(Thread.currentThread().getContextClassLoader(),
                UserService.class, client);
    }

}
