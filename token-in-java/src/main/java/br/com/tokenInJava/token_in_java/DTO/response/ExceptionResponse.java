package br.com.tokenInJava.token_in_java.DTO.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class ExceptionResponse {

    private String code;

    private String message;

    private int httpStatus;

}
