package io.github.imsejin.jsonrpc4j.client;

import io.github.imsejin.jsonrpc4j.server.model.Product;
import io.github.imsejin.jsonrpc4j.server.model.User;
import io.github.imsejin.jsonrpc4j.server.service.ProductService;
import io.github.imsejin.jsonrpc4j.server.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class ClientApplication implements ApplicationRunner {

    private final ProductService productService;

    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Product p0 = productService.createProduct(100L, "Hamburger", new BigInteger("5000"));
        log.info("productService.createProduct: {}", p0);

        Product p1 = productService.createRandomProduct(202L);
        log.info("productService.createRandomProduct: {}", p1);

        User user = userService.createRandomUser();
        log.info("userService.createRandomUser: {}", user);

        userService.sendUser(user);
    }

}
