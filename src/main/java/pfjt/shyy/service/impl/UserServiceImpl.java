package pfjt.shyy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfjt.shyy.entity.User;
import pfjt.shyy.repository.UserRepository;
import pfjt.shyy.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public void delete(long id) {
        userRepository.delete(id);
    }

    @Override
    public User findUserById(long id) {
        return userRepository.findOne(id);
    }
}
