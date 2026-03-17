package br.com.tokenInJava.token_in_java.exceptions;

import org.springframework.http.HttpStatus;

public interface ExceptionInterface {

    String getCode();
    String getMessage();
    int getHttpStatus();

}
