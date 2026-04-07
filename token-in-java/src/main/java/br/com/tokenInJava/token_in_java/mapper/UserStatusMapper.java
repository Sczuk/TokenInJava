package br.com.tokenInJava.token_in_java.mapper;

import br.com.tokenInJava.token_in_java.DTO.response.user.UserStatusResponse;
import br.com.tokenInJava.token_in_java.entity.user.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserStatusMapper {

    UserStatusResponse toDTO(User user);

}
