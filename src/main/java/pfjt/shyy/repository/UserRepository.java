package pfjt.shyy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pfjt.shyy.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
//    User findById(long id);


}
