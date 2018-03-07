package pfjt.shyy.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pfjt.shyy.entity.NewUser;
import pfjt.shyy.entity.User;


import java.util.List;


public interface NewUserService {
    public List<NewUser> getUserList();
    public List<NewUser> getUserList(int page,int rows);

    public void  save(NewUser newUser);
    public void  delete(long id);
    public  NewUser getUser(long id);
    public int getRecordCount();

    public Page<NewUser> getUserByPage(int page, int rows);
}
