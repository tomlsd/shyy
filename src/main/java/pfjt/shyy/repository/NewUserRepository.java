package pfjt.shyy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pfjt.shyy.entity.NewUser;
import sun.awt.SunHints;

public interface NewUserRepository extends JpaRepository<NewUser,Long>{
@Query(value="select count(t) from NewUser t")
int getRecordCount();



}
