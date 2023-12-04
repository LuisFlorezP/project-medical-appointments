package mentoring.projectmedicalappointments.doctor.application.handler.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mentoring.projectmedicalappointments.doctor.application.dto.request.DoctorRequest;
import mentoring.projectmedicalappointments.doctor.application.dto.response.DoctorLocationResponse;
import mentoring.projectmedicalappointments.doctor.application.dto.response.DoctorResponse;
import mentoring.projectmedicalappointments.doctor.application.dto.response.DoctorSpecializationResponse;
import mentoring.projectmedicalappointments.doctor.application.handler.IDoctorHandler;
import mentoring.projectmedicalappointments.doctor.application.mapper.IDoctorMapper;
import mentoring.projectmedicalappointments.doctor.domain.model.Doctor;
import mentoring.projectmedicalappointments.doctor.domain.port.api.IDoctorServicePort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import static mentoring.projectmedicalappointments.common.application.utils.Constants.*;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class DoctorHandler implements IDoctorHandler {

    private final IDoctorServicePort doctorServicePort;
    private final IDoctorMapper doctorMapper;

    @Override
    public Long saveDoctor(DoctorRequest request) {
        log.info(LOG_START_SAVE_DOCTOR);

        Doctor doctor = doctorMapper.requestToModel(request);
        Long doctorId = doctorServicePort.saveDoctor(doctor);

        log.info(LOG_END_SAVE_DOCTOR);
        return doctorId;
    }

    @Override
    public DoctorResponse getDoctorById(Long doctorId) {
        log.info(LOG_START_GET_DOCTOR_BY_ID);

        Doctor doctor = doctorServicePort.getDoctorById(doctorId);
        DoctorResponse response = doctorMapper.modelToResponse(doctor);

        log.info(LOG_END_GET_DOCTOR_BY_ID);
        return response;
    }

    @Override
    public List<DoctorResponse> getDoctors() {
        log.info(LOG_START_GET_DOCTORS);

        List<Doctor> doctorList = doctorServicePort.getDoctors();
        List<DoctorResponse> responseList = doctorMapper.modelsToResponses(doctorList);

        log.info(LOG_END_GET_DOCTORS);
        return responseList;
    }

    @Override
    public List<DoctorLocationResponse> getDoctorsByLocation(Long locationId) {
        log.info(LOG_START_GET_DOCTORS_BY_LOCATION);

        List<Doctor> doctorList = doctorServicePort.getDoctorsByLocation(locationId);
        List<DoctorLocationResponse> responseList = doctorMapper.modelsLocationToResponses(doctorList);

        log.info(LOG_END_GET_DOCTORS_BY_LOCATION);
        return responseList;
    }

    @Override
    public List<DoctorSpecializationResponse> getDoctorsBySpecialization(Long specializationId) {
        log.info(LOG_START_GET_DOCTORS_BY_SPECIALIZATION);

        List<Doctor> doctorList = doctorServicePort.getDoctorsBySpecialization(specializationId);
        List<DoctorSpecializationResponse> responseList = doctorMapper.modelsSpecializationToResponses(doctorList);

        log.info(LOG_END_GET_DOCTORS_BY_SPECIALIZATION);
        return responseList;
    }
}
