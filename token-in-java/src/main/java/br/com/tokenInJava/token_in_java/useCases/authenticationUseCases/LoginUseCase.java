package br.com.tokenInJava.token_in_java.useCases.authenticationUseCases;

import br.com.tokenInJava.token_in_java.DTO.request.authentication.AuthenticationRequest;
import br.com.tokenInJava.token_in_java.DTO.response.LoginResponse;
import br.com.tokenInJava.token_in_java.config.security.TokenConfig;
import br.com.tokenInJava.token_in_java.entity.user.User;
import br.com.tokenInJava.token_in_java.exceptions.NotPossibleLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.token.TokenService;
import org.springframework.stereotype.Service;

@Service
public class LoginUseCase {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenConfig tokenConfig;

    public ResponseEntity<String> execute(AuthenticationRequest request){
        var usernamePassword = new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword());
        var auth = this.authenticationManager.authenticate(usernamePassword);
        var token = tokenConfig.genereteToken((User)auth.getPrincipal());
        LoginResponse response = new LoginResponse(token);
        return ResponseEntity.ok(response.getToken());
    }
}
