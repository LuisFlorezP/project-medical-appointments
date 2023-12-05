package mentoring.projectmedicalappointments.patient.infrastructure.output.persistence.jpa.repository;

import mentoring.projectmedicalappointments.patient.infrastructure.output.persistence.jpa.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepository extends JpaRepository<PatientEntity, Long> {
}
