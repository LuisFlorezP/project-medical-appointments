package mentoring.projectmedicalappointments.doctor.domain.port.spi;

import mentoring.projectmedicalappointments.doctor.domain.model.Doctor;
import java.util.List;

public interface IDoctorPersistencePort {

    Long saveDoctor(Doctor doctor);

    Doctor getDoctorById(Long doctorId);

    List<Doctor> getDoctors();

    List<Doctor> getDoctorsByLocation(Long locationId);

    List<Doctor> getDoctorsBySpecialization(Long specializationId);
}
