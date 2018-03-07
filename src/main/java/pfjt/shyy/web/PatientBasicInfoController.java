package pfjt.shyy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pfjt.shyy.entity.HistoryDiagnosis;
import pfjt.shyy.entity.PatientBasicInfo;
import pfjt.shyy.service.HistoryDiagnosisService;
import pfjt.shyy.service.PatientBasicInfoService;
import pfjt.shyy.service.vo.zcnew;

@Controller
@RequestMapping("/shyy")
public class PatientBasicInfoController {
    @Autowired
    PatientBasicInfoService patientBasicInfoService;
    @Autowired
    HistoryDiagnosisService historyDiagnosisService;

    @RequestMapping("/useradd")
    public String toAdd(){
        return "/user/PatientBasicInfoAdd";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(zcnew zcl){
        PatientBasicInfo patientBasicInfo=new PatientBasicInfo();
        HistoryDiagnosis historyDiagnosis=new HistoryDiagnosis();
        patientBasicInfo.setName(zcl.getName());
        historyDiagnosis.setAllergichistory(zcl.getAllergichistory());
        patientBasicInfoService.save(patientBasicInfo);
        historyDiagnosisService.save(historyDiagnosis);
        return "/user/ok";
    }


}
