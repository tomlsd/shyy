package pfjt.shyy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfjt.shyy.entity.HistoryDiagnosis;
import pfjt.shyy.repository.HistoryDiagnosisRepository;
import pfjt.shyy.service.HistoryDiagnosisService;

@Service
public class HistoryDiagnosisServiceImpl implements HistoryDiagnosisService {
    @Autowired
    HistoryDiagnosisRepository historyDiagnosisRepository;
    @Override
    public void save(HistoryDiagnosis historyDiagnosis) {
        historyDiagnosisRepository.save(historyDiagnosis);
    }
}
