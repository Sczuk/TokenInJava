package br.com.tokenInJava.token_in_java.controller;

import br.com.tokenInJava.token_in_java.DTO.request.authentication.AuthenticationRequest;
import br.com.tokenInJava.token_in_java.DTO.request.user.UserRequest;
import br.com.tokenInJava.token_in_java.DTO.response.user.UserStatusResponse;
import br.com.tokenInJava.token_in_java.useCases.authenticationUseCases.LoginUseCase;
import br.com.tokenInJava.token_in_java.useCases.authenticationUseCases.RegisterUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private RegisterUseCase registerUseCase;

    @Autowired
    private LoginUseCase loginUseCase;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Valid AuthenticationRequest request){
        return loginUseCase.execute(request);
    }

    @PostMapping("/register")
    public ResponseEntity<UserStatusResponse> register(@RequestBody @Valid UserRequest request){
        UserStatusResponse response = registerUseCase.execute(request);
        return ResponseEntity.ok(response);
    }

}
