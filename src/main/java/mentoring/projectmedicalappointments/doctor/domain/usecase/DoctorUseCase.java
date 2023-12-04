package mentoring.projectmedicalappointments.doctor.domain.usecase;

import mentoring.projectmedicalappointments.doctor.domain.model.Doctor;
import mentoring.projectmedicalappointments.doctor.domain.port.api.IDoctorServicePort;
import mentoring.projectmedicalappointments.doctor.domain.port.spi.IDoctorPersistencePort;
import java.util.List;

public class DoctorUseCase implements IDoctorServicePort {

    private final IDoctorPersistencePort doctorPersistencePort;

    public DoctorUseCase(IDoctorPersistencePort doctorPersistencePort) {
        this.doctorPersistencePort = doctorPersistencePort;
    }

    @Override
    public Long saveDoctor(Doctor doctor) {
        return doctorPersistencePort.saveDoctor(doctor);
    }

    @Override
    public Doctor getDoctorById(Long doctorId) {
        return doctorPersistencePort.getDoctorById(doctorId);
    }

    @Override
    public List<Doctor> getDoctors() {
        return doctorPersistencePort.getDoctors();
    }

    @Override
    public List<Doctor> getDoctorsByLocation(Long locationId) {
        return doctorPersistencePort.getDoctorsByLocation(locationId);
    }

    @Override
    public List<Doctor> getDoctorsBySpecialization(Long specializationId) {
        return doctorPersistencePort.getDoctorsBySpecialization(specializationId);
    }
}
