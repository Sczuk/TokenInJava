package br.com.tokenInJava.token_in_java.mapper;

import br.com.tokenInJava.token_in_java.DTO.request.product.ProductRequest;
import br.com.tokenInJava.token_in_java.DTO.response.product.ProductResponse;
import br.com.tokenInJava.token_in_java.entity.product.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    Product toEntity(ProductRequest request);

    ProductResponse toDTO(Product product);

}
