package mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.repository;

import mentoring.projectmedicalappointments.appointment.infrastructure.output.persistence.jpa.entity.AppointmentEntity;
import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDateTime;

public interface IAppointmentRepository extends JpaRepository<AppointmentEntity, Long> {

    @Query("SELECT COUNT(a) > 0 FROM AppointmentEntity a WHERE a.doctor = :doctor AND a.scheduledDate = :scheduledDate")
    boolean existsByDoctorAndScheduledDate(@Param("doctor") DoctorEntity doctor, @Param("scheduledDate") LocalDateTime scheduledDate);
}
