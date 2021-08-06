package io.github.imsejin.jsonrpc4j.server.service.impl;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import io.github.imsejin.jsonrpc4j.server.model.Product;
import io.github.imsejin.jsonrpc4j.server.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.jeasy.random.EasyRandom;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Slf4j
@Service
@AutoJsonRpcServiceImpl
class ProductServiceImpl implements ProductService {

    private final EasyRandom random = new EasyRandom();

    @Override
    public Product createProduct(Long id, String name, BigInteger price) {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);

        log.info("createProduct: {}", product);

        return product;
    }

    @Override
    public Product createRandomProduct(Long id) {
        Product product = random.nextObject(Product.class);
        product.setId(id);

        log.info("createRandomProduct: {}", product);

        return product;
    }

}
