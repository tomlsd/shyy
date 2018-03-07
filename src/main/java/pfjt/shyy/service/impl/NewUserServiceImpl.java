package pfjt.shyy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pfjt.shyy.entity.NewUser;
import pfjt.shyy.repository.NewUserRepository;
import pfjt.shyy.service.NewUserService;

import java.util.List;
@Service
public class NewUserServiceImpl implements NewUserService {
@Autowired
    NewUserRepository newUserRepository;
    @Override
    public List<NewUser> getUserList() {
        return newUserRepository.findAll();
    }

    @Override
    public List<NewUser> getUserList(int page, int rows) {
        return null;
    }

    @Override
    public void save(NewUser newUser) {
        newUserRepository.save(newUser);

    }

    @Override
    public void delete(long id) {
        newUserRepository.delete(id);

    }

    @Override
    public NewUser getUser(long id) {
       return  newUserRepository.findOne(id);
    }

    @Override
    public int getRecordCount() {
        return newUserRepository.getRecordCount();
    }

    @Override
    public Page<NewUser> getUserByPage(int page, int rows) {
        Pageable pageable = new PageRequest(page, rows);
        return newUserRepository.findAll(pageable);
    }
}
