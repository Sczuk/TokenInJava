package br.com.tokenInJava.token_in_java.handler;

import br.com.tokenInJava.token_in_java.DTO.response.ExceptionResponse;
import br.com.tokenInJava.token_in_java.exceptions.ExceptionInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RuntimeExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionResponse> exceptionReader(ExceptionInterface exception){
        ExceptionResponse response = new ExceptionResponse(
                exception.getCode(),
                exception.getMessage(),
                exception.getHttpStatus());
        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }

}
