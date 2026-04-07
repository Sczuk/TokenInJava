package br.com.tokenInJava.token_in_java.DTO.request.userUpdate;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateDescriptionRequest {

    @NotBlank
    private String description;

}
