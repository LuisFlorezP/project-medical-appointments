package mentoring.projectmedicalappointments.patient.application.handler.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mentoring.projectmedicalappointments.patient.application.dto.request.PatientRequest;
import mentoring.projectmedicalappointments.patient.application.dto.response.PatientResponse;
import mentoring.projectmedicalappointments.patient.application.handler.IPatientHandler;
import mentoring.projectmedicalappointments.patient.application.mapper.IPatientMapper;
import mentoring.projectmedicalappointments.patient.domain.model.Patient;
import mentoring.projectmedicalappointments.patient.domain.port.api.IPatientServicePort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import static mentoring.projectmedicalappointments.common.application.utils.Constants.*;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class PatientHandler implements IPatientHandler {

    private final IPatientServicePort patientServicePort;
    private final IPatientMapper patientMapper;

    @Override
    public Long savePatient(PatientRequest request) {
        log.info(LOG_START_SAVE_PATIENT);

        Patient patient = patientMapper.requestToModel(request);
        Long patientId = patientServicePort.savePatient(patient);

        log.info(LOG_END_SAVE_PATIENT);
        return patientId;
    }

    @Override
    public List<PatientResponse> getPatients() {
        log.info(LOG_START_GET_PATIENTS);

        List<Patient> patientList = patientServicePort.getPatients();
        List<PatientResponse> responseList = patientMapper.modelsToResponses(patientList);

        log.info(LOG_END_GET_PATIENTS);
        return responseList;
    }
}
