package br.com.tokenInJava.token_in_java.DTO.request.authentication;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AuthenticationRequest {

    @NotBlank(message = "need email to login")
    private String email;

    @NotBlank(message = "need password to login")
    private String password;

}
