package pfjt.shyy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfjt.shyy.entity.PatientBasicInfo;
import pfjt.shyy.repository.PatientBasicInfoRepository;
import pfjt.shyy.service.PatientBasicInfoService;

@Service
public class PatientBasicInfoServiceImpl implements PatientBasicInfoService {
    @Autowired
    PatientBasicInfoRepository patientBasicInfoRepository;
    @Override
    public void save(PatientBasicInfo patientBasicInfo) {
patientBasicInfoRepository.save(patientBasicInfo);
    }
}
