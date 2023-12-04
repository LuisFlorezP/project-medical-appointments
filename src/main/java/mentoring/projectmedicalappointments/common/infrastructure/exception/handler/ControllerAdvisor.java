package mentoring.projectmedicalappointments.common.infrastructure.exception.handler;

import mentoring.projectmedicalappointments.common.infrastructure.exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(value = BusinessException.class)
    public ResponseEntity<ExceptionResponse> handlerBusinessException(BusinessException e) {
        return ResponseEntity.status(e.getStatus())
                .body(new ExceptionResponse(e.getMessage(), e.getStatus().getReasonPhrase(), e.getStatus().value()));
    }
}
