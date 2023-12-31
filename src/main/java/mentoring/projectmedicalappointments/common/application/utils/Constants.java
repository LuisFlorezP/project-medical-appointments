package mentoring.projectmedicalappointments.common.application.utils;

import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class Constants {

    private Constants() {
        throw new IllegalStateException(EXCEPTION_UTILITY_CLASS);
    }

    public static final String EXCEPTION_UTILITY_CLASS = "Utility class";
    public static final String TITLE = "Medical appointments";
    public static final String TERMS_OF_SERVICE = "http://swagger.io/terms/";
    public static final String NAME_LICENSE = "Apache 2.0";
    public static final String URL_LICENSE = "http://springdoc.org";
    public static final String APP_DESCRIPTION = "Project for medical appointments";
    public static final String APP_VERSION = "1.0.0";



    public static final String LOG_START_SAVE_DOCTOR = ">>> Start saveDoctor";
    public static final String LOG_END_SAVE_DOCTOR = "<<< End saveDoctor";

    public static final String LOG_START_GET_DOCTOR_BY_ID = ">>> Start getDoctorById";
    public static final String LOG_END_GET_DOCTOR_BY_ID = "<<< End getDoctorById";

    public static final String LOG_START_GET_DOCTORS = ">>> Start getDoctors";
    public static final String LOG_END_GET_DOCTORS = "<<< End getDoctors";

    public static final String LOG_START_GET_DOCTORS_BY_LOCATION = ">>> Start getDoctorsByLocation";
    public static final String LOG_END_GET_DOCTORS_BY_LOCATION = "<<< End getDoctorsByLocation";

    public static final String LOG_START_GET_DOCTORS_BY_SPECIALIZATION = ">>> Start getDoctorsBySpecialization";
    public static final String LOG_END_GET_DOCTORS_BY_SPECIALIZATION = "<<< End getDoctorsBySpecialization";



    public static final String LOG_START_SAVE_APPOINTMENT = ">>> Start saveAppointment";
    public static final String LOG_END_SAVE_APPOINTMENT = "<<< End saveAppointment";

    public static final String LOG_START_GET_APPOINTMENTS = ">>> Start getAppointments";
    public static final String LOG_END_GET_APPOINTMENTS = "<<< End getAppointments";



    public static final String LOG_START_SAVE_PATIENT = ">>> Start savePatient";
    public static final String LOG_END_SAVE_PATIENT = "<<< End savePatient";

    public static final String LOG_START_GET_PATIENTS = ">>> Start getPatients";
    public static final String LOG_END_GET_PATIENTS = "<<< End getPatients";
}
