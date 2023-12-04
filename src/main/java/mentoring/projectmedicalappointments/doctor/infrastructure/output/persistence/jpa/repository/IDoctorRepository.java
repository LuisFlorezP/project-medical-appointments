package mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.repository;

import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.entity.DoctorEntity;
import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.entity.LocationEntity;
import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.entity.SpecializationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface IDoctorRepository extends JpaRepository<DoctorEntity, Long> {

    @Query("SELECT d FROM DoctorEntity d WHERE d.specialization = :specialization")
    List<DoctorEntity> findBySpecialization(@Param("specialization") SpecializationEntity specialization);

    @Query("SELECT d FROM DoctorEntity d WHERE d.location = :location")
    List<DoctorEntity> findByLocation(@Param("location") LocationEntity location);
}
