package pfjt.shyy.service;

import pfjt.shyy.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getUserList();
    public void  save(User user);
    public  void  delete(long id);
    public User findUserById(long id);


}
