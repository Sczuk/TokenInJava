package br.com.tokenInJava.token_in_java.useCases.authenticationUseCases;

import br.com.tokenInJava.token_in_java.DTO.request.user.UserRequest;
import br.com.tokenInJava.token_in_java.DTO.response.user.UserStatusResponse;
import br.com.tokenInJava.token_in_java.entity.user.User;
import br.com.tokenInJava.token_in_java.exceptions.UserExitsException;
import br.com.tokenInJava.token_in_java.mapper.UserMapper;
import br.com.tokenInJava.token_in_java.mapper.UserStatusMapper;
import br.com.tokenInJava.token_in_java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterUseCase {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserStatusMapper statusMapper;

    public UserStatusResponse execute(UserRequest request){
        if(userRepository.existsByEmail(request.getEmail())) throw new UserExitsException("User exists");
        String encryptedPassword = new BCryptPasswordEncoder().encode(request.getPassword());
        request.setPassword(encryptedPassword);
        User user = userMapper.toEntity(request);
        this.userRepository.save(user);
        return statusMapper.toDTO(user);
    }
}
