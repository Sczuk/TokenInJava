package br.com.tokenInJava.token_in_java.useCases.productUseCases;

import br.com.tokenInJava.token_in_java.DTO.response.product.ProductResponse;
import br.com.tokenInJava.token_in_java.entity.product.Product;
import br.com.tokenInJava.token_in_java.exceptions.productExecptions.ProductNotFoundException;
import br.com.tokenInJava.token_in_java.mapper.ProductMapper;
import br.com.tokenInJava.token_in_java.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetProduct {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductMapper mapper;

    public ProductResponse execute(int id){
        if(!repository.existsById(id)) throw new ProductNotFoundException("Invalid Id");
        Product product = repository.findById(id).get();
        return mapper.toDTO(product);
    }
}
