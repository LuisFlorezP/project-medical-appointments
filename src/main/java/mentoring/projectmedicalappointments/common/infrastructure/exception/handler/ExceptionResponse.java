package mentoring.projectmedicalappointments.common.infrastructure.exception.handler;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExceptionResponse {

    private final String message;
    private final String reasonPhrase;
    private final Integer statusCode;
}
