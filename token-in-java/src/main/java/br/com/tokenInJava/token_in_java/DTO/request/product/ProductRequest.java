package br.com.tokenInJava.token_in_java.DTO.request.product;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {

    @NotBlank(message = "O produto precisa ter um nome")
    private String name;

    @DecimalMin(value= "0.1",message = "The product need a price")
    private double price;
}
