package br.com.tokenInJava.token_in_java.exceptions.productExecptions;

import br.com.tokenInJava.token_in_java.exceptions.ExceptionInterface;
import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends RuntimeException implements ExceptionInterface {

    private final String code = "PRODUCT_NOT_FOUND";

    private String message;

    private final int httpStatus = HttpStatus.NOT_FOUND.value();

    public ProductNotFoundException(String message){
        this.message = message;
    }


    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public int getHttpStatus() {
        return httpStatus;
    }
}
