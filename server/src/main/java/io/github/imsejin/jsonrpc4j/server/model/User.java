package io.github.imsejin.jsonrpc4j.server.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class User {

    private long seq;

    private String id;

    private UUID password;

}
