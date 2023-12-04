package mentoring.projectmedicalappointments.common.infrastructure.exception.handler;

import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class ExceptionConstants {

    private ExceptionConstants() {
        throw new IllegalStateException(EXCEPTION_UTILITY_CLASS);
    }

    public static final String EXCEPTION_UTILITY_CLASS = "Utility class";
    public static final String OCCUPIED_SPACE = "The space for which you wish to schedule is already occupied for said health provider.";
}
