package br.com.tokenInJava.token_in_java.handler;

import br.com.tokenInJava.token_in_java.DTO.response.ExceptionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class )
    public ResponseEntity<ExceptionResponse> exceptionReader(MethodArgumentNotValidException exception){
        ExceptionResponse response = new ExceptionResponse(
                exception.getStatusCode().toString(),
                exception.getFieldError().getDefaultMessage(),
                exception.getStatusCode().value());
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }
}
