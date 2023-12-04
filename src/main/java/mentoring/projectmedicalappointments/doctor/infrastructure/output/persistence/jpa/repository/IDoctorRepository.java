package mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.repository;

import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepository extends JpaRepository<DoctorEntity, Long> {
}
