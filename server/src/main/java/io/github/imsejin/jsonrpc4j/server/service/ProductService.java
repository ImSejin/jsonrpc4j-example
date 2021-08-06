package io.github.imsejin.jsonrpc4j.server.service;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;
import io.github.imsejin.jsonrpc4j.server.model.Product;

import java.math.BigInteger;

@JsonRpcService("/apis/products.json")
public interface ProductService {

    Product createProduct(@JsonRpcParam("id") Long id,
                          @JsonRpcParam("name") String name,
                          @JsonRpcParam("price") BigInteger price);

    Product createRandomProduct(@JsonRpcParam("id") Long id);

}
