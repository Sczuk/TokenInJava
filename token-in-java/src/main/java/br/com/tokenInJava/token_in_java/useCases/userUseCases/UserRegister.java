package br.com.tokenInJava.token_in_java.useCases.userUseCases;

import br.com.tokenInJava.token_in_java.DTO.request.UserRequest;
import br.com.tokenInJava.token_in_java.DTO.response.UserStatusResponse;
import br.com.tokenInJava.token_in_java.entity.User;
import br.com.tokenInJava.token_in_java.exceptions.UserExitsException;
import br.com.tokenInJava.token_in_java.mapper.UserMapper;
import br.com.tokenInJava.token_in_java.mapper.UserStatusMapper;
import br.com.tokenInJava.token_in_java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegister {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserStatusMapper userStatusMapper;

    public UserStatusResponse execute(UserRequest request){
        if(userRepository.existsByEmail(request.getEmail())) throw new UserExitsException("User exists");
        User user = userMapper.toEntity(request);
        user.setUserStatus(true);
        userRepository.save(user);
        UserStatusResponse response = userStatusMapper.toDTO(user);
        return response;
    }
}
