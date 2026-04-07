package br.com.tokenInJava.token_in_java.useCases.productUseCases;

import br.com.tokenInJava.token_in_java.exceptions.productExecptions.ProductNotFoundException;
import br.com.tokenInJava.token_in_java.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteProduct {

    @Autowired
    private ProductRepository repository;

    public void execute(int id){
        if(!repository.existsById(id)) throw new ProductNotFoundException("Id invalid");
        repository.deleteById(id);
    }
}
