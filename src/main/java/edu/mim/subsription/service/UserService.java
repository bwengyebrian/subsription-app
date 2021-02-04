package edu.mim.subsription.service;

import edu.mim.subsription.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    User findById(Long id);
    void delete(User user);
    List<User> findAll();

}
