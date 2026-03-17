package br.com.tokenInJava.token_in_java.repository;

import br.com.tokenInJava.token_in_java.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.function.Function;

public interface UserRepository extends JpaRepository<User,Integer> {

    boolean existsByEmail(String email);

    User findByEmail(String email);
}
