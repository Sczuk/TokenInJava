package br.com.tokenInJava.token_in_java.useCases.productUseCases;

import br.com.tokenInJava.token_in_java.DTO.request.product.ProductRequest;
import br.com.tokenInJava.token_in_java.DTO.response.product.ProductResponse;
import br.com.tokenInJava.token_in_java.entity.product.Product;
import br.com.tokenInJava.token_in_java.mapper.ProductMapper;
import br.com.tokenInJava.token_in_java.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProduct {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductMapper mapper;

    public ProductResponse execute(ProductRequest request){
        Product product = mapper.toEntity(request);
        repository.save(product);
        return mapper.toDTO(product);
    }
}
