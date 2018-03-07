package pfjt.shyy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserLei {
    @Id
    @GeneratedValue
    private long id;

    private String userName;

    private String password;

    private int age;

    public long getId() {
        return id;
    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
    public String getUserName() {
        return userName;
    }

//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
    public String getPassword() {
        return password;
    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
