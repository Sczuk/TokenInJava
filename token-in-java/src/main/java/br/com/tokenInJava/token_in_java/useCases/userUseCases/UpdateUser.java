package br.com.tokenInJava.token_in_java.useCases.userUseCases;

import br.com.tokenInJava.token_in_java.DTO.request.user.userUpdate.UpdateDescriptionRequest;
import br.com.tokenInJava.token_in_java.DTO.response.user.UserStatusResponse;
import br.com.tokenInJava.token_in_java.entity.user.User;
import br.com.tokenInJava.token_in_java.exceptions.UserNotFoundException;
import br.com.tokenInJava.token_in_java.mapper.UserStatusMapper;
import br.com.tokenInJava.token_in_java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUser {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserStatusMapper mapper;

    public UserStatusResponse execute(UpdateDescriptionRequest request, String email){
        if(!userRepository.existsByEmail(email))  throw new UserNotFoundException("Not is possible edit this user");
        User user = userRepository.findByEmail(email);
        user.setDescription(request.getDescription());
        userRepository.save(user);
        UserStatusResponse response = mapper.toDTO(user);
        return response;
    }
}
