package pfjt.shyy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pfjt.shyy.entity.PatientBasicInfo;

public interface PatientBasicInfoRepository extends JpaRepository<PatientBasicInfo,Long> {
}
