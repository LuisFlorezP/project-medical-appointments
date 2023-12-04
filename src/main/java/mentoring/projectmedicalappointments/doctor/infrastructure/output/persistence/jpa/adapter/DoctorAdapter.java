package mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.adapter;

import lombok.RequiredArgsConstructor;
import mentoring.projectmedicalappointments.doctor.domain.model.Doctor;
import mentoring.projectmedicalappointments.doctor.domain.port.spi.IDoctorPersistencePort;
import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.mapper.IDoctorEntityMapper;
import mentoring.projectmedicalappointments.doctor.infrastructure.output.persistence.jpa.repository.IDoctorRepository;

import java.util.List;

@RequiredArgsConstructor
public class DoctorAdapter implements IDoctorPersistencePort {

    private final IDoctorRepository doctorRepository;
    private final IDoctorEntityMapper doctorEntityMapper;

    @Override
    public Long saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctorEntityMapper.modelToEntity(doctor)).getDoctorId();
    }

    @Override
    public Doctor getDoctorById(Long doctorId) {
        return doctorEntityMapper.entityToModel(doctorRepository.findById(doctorId).orElse(null));
    }

    @Override
    public List<Doctor> getDoctors() {
        return doctorEntityMapper.entitiesToModels(doctorRepository.findAll());
    }
}
