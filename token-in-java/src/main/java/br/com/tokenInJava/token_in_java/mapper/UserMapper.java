package br.com.tokenInJava.token_in_java.mapper;

import br.com.tokenInJava.token_in_java.DTO.request.user.UserRequest;
import br.com.tokenInJava.token_in_java.DTO.response.user.UserResponse;
import br.com.tokenInJava.token_in_java.entity.user.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserResponse toDTO(User user);

    User toEntity(UserRequest user);

}
