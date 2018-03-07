package pfjt.shyy.service.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class zcnew {

//    private	long	id;
//    private	String	registrationno;
    private	String	name;
    private	int	sex;


//    private Date birthday;
//    private	float	agevalue;
//    private	String	mobile;
//    private	String	source;
//    private	int	province;
//    private	int	city;
//    private	String	address;
//    private	String	idcard;


//    private	String	medicalrecordno;
//    private	String	patientregistrationno;
    private	int	allergichistory;
//    private	String	allergichistorydetails;
//    private	int	pasthistory;
//    private	String	pasthistorydetails;
//    private Date createdate;
//    private	Date	modifydate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAllergichistory() {
        return allergichistory;
    }

    public void setAllergichistory(int allergichistory) {
        this.allergichistory = allergichistory;
    }
}
