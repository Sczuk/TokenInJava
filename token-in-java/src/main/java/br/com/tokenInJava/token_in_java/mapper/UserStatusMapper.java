package br.com.tokenInJava.token_in_java.mapper.user;

import br.com.tokenInJava.token_in_java.DTO.response.user.UserStatusResponse;
import br.com.tokenInJava.token_in_java.entity.user.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserStatusMapper {

    UserStatusResponse toDTO(User user);

}
