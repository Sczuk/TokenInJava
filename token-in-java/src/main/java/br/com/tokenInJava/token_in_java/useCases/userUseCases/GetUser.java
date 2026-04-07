package br.com.tokenInJava.token_in_java.useCases.userUseCases;

import br.com.tokenInJava.token_in_java.DTO.response.user.UserResponse;
import br.com.tokenInJava.token_in_java.entity.user.User;
import br.com.tokenInJava.token_in_java.exceptions.UserNotFoundException;
import br.com.tokenInJava.token_in_java.mapper.UserMapper;
import br.com.tokenInJava.token_in_java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUser {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    public UserResponse execute(String email){
        if(!userRepository.existsByEmail(email)) throw new UserNotFoundException("User not found");
        User user = userRepository.findByEmail(email);
        UserResponse response = userMapper.toDTO(user);
        return response;
    }
}
