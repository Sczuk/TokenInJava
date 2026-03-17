package br.com.tokenInJava.token_in_java.mapper;

import br.com.tokenInJava.token_in_java.DTO.response.UserStatusResponse;
import br.com.tokenInJava.token_in_java.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserStatusMapper {

    UserStatusResponse toDTO(User user);

}
