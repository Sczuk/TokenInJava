package br.com.tokenInJava.token_in_java.mapper;

import br.com.tokenInJava.token_in_java.DTO.request.UserRequest;
import br.com.tokenInJava.token_in_java.DTO.response.UserResponse;
import br.com.tokenInJava.token_in_java.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse toDTO(User user);

    User toEntity(UserRequest user);

}
