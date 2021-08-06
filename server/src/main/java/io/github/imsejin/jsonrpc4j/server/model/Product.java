package io.github.imsejin.jsonrpc4j.server.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;

@Getter
@Setter
@ToString
public class Product {

    private Long id;

    private String name;

    private BigInteger price;

}
