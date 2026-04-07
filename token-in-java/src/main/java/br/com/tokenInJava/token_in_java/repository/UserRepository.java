package br.com.tokenInJava.token_in_java.repository;

import br.com.tokenInJava.token_in_java.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    boolean existsByEmail(String email);

    User findByEmail(String email);
}
