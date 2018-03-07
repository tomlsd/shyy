package pfjt.shyy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class HistoryDiagnosis {
@Id
@GeneratedValue
    private	long	id;
    private	String	medicalrecordno;
    private	String	patientregistrationno;
    private	int	allergichistory;
    private	String	allergichistorydetails;
    private	int	pasthistory;
    private	String	pasthistorydetails;
    private Date createdate;
    private	Date	modifydate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMedicalrecordno() {
        return medicalrecordno;
    }

    public void setMedicalrecordno(String medicalrecordno) {
        this.medicalrecordno = medicalrecordno;
    }

    public String getPatientregistrationno() {
        return patientregistrationno;
    }

    public void setPatientregistrationno(String patientregistrationno) {
        this.patientregistrationno = patientregistrationno;
    }

    public int getAllergichistory() {
        return allergichistory;
    }

    public void setAllergichistory(int allergichistory) {
        this.allergichistory = allergichistory;
    }

    public String getAllergichistorydetails() {
        return allergichistorydetails;
    }

    public void setAllergichistorydetails(String allergichistorydetails) {
        this.allergichistorydetails = allergichistorydetails;
    }

    public int getPasthistory() {
        return pasthistory;
    }

    public void setPasthistory(int pasthistory) {
        this.pasthistory = pasthistory;
    }

    public String getPasthistorydetails() {
        return pasthistorydetails;
    }

    public void setPasthistorydetails(String pasthistorydetails) {
        this.pasthistorydetails = pasthistorydetails;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}
