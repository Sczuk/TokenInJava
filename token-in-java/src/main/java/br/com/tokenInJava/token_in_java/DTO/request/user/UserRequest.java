package br.com.tokenInJava.token_in_java.DTO.request.user;

import br.com.tokenInJava.token_in_java.entity.user.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserRequest {

    @NotBlank(message = "O nome nao pode ser nulo")
    private String name;

    @NotBlank(message = "Insira uma senha")
    private String password;

    @NotBlank(message = "É necessario um email")
    @Email
    private String email;

    @NotBlank(message = "A descriçao é obrigatoria")
    private String description;

    @NotBlank(message = "Role cant be null")
    private String role;
}
