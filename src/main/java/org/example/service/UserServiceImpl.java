package org.example.service;

import org.example.repository.UserRepository;
import org.example.user.User;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public int saveUser(User user) {
        int newID = userRepository.saveUser(user);
        return newID;
    }
}
