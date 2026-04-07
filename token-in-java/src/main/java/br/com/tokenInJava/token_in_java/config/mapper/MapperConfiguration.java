package br.com.tokenInJava.token_in_java.config.mapper;

import br.com.tokenInJava.token_in_java.mapper.ProductMapper;
import br.com.tokenInJava.token_in_java.mapper.UserMapper;
import br.com.tokenInJava.token_in_java.mapper.UserStatusMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public ProductMapper productMapper(){
        return Mappers.getMapper(ProductMapper.class);
    }

    @Bean
    public UserMapper userMapper(){
        return Mappers.getMapper(UserMapper.class);
    }

    @Bean
    public UserStatusMapper userStatusMapper(){
        return Mappers.getMapper(UserStatusMapper.class);
    }

}
