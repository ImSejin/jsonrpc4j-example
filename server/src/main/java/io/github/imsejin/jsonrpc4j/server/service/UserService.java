package io.github.imsejin.jsonrpc4j.server.service;

import io.github.imsejin.jsonrpc4j.server.model.User;

public interface UserService {

    User createRandomUser();

    void sendUser(User user);

}
