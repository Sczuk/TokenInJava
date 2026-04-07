package br.com.tokenInJava.token_in_java.useCases.userUseCases;

import br.com.tokenInJava.token_in_java.entity.user.User;
import br.com.tokenInJava.token_in_java.exceptions.UserNotFoundException;
import br.com.tokenInJava.token_in_java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUser {

    @Autowired
    UserRepository userRepository;

    public void execute(String email){
        if(!userRepository.existsByEmail(email)) throw new UserNotFoundException("Not is possible delete this user");
        User user = userRepository.findByEmail(email);
        userRepository.deleteById(user.getId());
    }
}
