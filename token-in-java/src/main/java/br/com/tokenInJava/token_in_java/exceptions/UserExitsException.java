package br.com.tokenInJava.token_in_java.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
public class UserExitsException extends RuntimeException implements ExceptionInterface{

    private String message;
    private final String code = "USER_EXITS";
    private int httpStatus = HttpStatus.CONFLICT.value();

    public UserExitsException(String message){
        this.message = message;
    }

    @Override
    public int getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getCode() {
        return code;
    }
}
