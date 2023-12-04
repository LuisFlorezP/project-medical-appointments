package mentoring.projectmedicalappointments.common.infrastructure.exception;

import org.springframework.http.HttpStatus;
import static mentoring.projectmedicalappointments.common.infrastructure.exception.handler.ExceptionConstants.OCCUPIED_SPACE;

public class OccupiedSpaceException extends BusinessException{

    public OccupiedSpaceException() {
        super(OCCUPIED_SPACE, HttpStatus.BAD_REQUEST);
    }
}
