package br.com.tokenInJava.token_in_java.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
public class UserNotFoundException extends RuntimeException implements ExceptionInterface{

    private final int httpStatus = HttpStatus.NOT_FOUND.value();
    private final String code = "USER_NOT_FOUND";
    private String message;

    public UserNotFoundException(String message){
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
