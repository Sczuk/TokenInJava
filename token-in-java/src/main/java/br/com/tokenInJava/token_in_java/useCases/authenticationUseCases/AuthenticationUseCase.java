package br.com.tokenInJava.token_in_java.useCases.authenticationUseCases;

import br.com.tokenInJava.token_in_java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationUseCase implements UserDetailsService {

    @Autowired
    UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return repository.findByEmail(email);
    }
}
