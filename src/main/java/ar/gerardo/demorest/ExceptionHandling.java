package ar.gerardo.demorest;

import org.springframework.http.HttpStatus;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    ProblemDetail handleConstraintViolationException() {
        return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, "La solicitud HTTP tiene errores");
    }

}
