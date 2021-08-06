package io.github.imsejin.jsonrpc4j.server.service.impl;

import io.github.imsejin.jsonrpc4j.server.model.User;
import io.github.imsejin.jsonrpc4j.server.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.jeasy.random.EasyRandom;
import org.springframework.stereotype.Service;

@Slf4j
@Service
class UserServiceImpl implements UserService {

    private final EasyRandom random = new EasyRandom();

    @Override
    public User createRandomUser() {
        User user = random.nextObject(User.class);
        user.setSeq(Math.abs(user.getSeq()));

        log.info("createRandomUser: {}", user);

        return user;
    }

    @Override
    public void sendUser(User user) {
        log.info("sendUser: {}", user);
    }

}
