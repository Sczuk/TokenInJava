package br.com.tokenInJava.token_in_java.controller;

import br.com.tokenInJava.token_in_java.DTO.request.product.ProductRequest;
import br.com.tokenInJava.token_in_java.DTO.response.product.ProductResponse;
import br.com.tokenInJava.token_in_java.useCases.productUseCases.CreateProduct;
import br.com.tokenInJava.token_in_java.useCases.productUseCases.DeleteProduct;
import br.com.tokenInJava.token_in_java.useCases.productUseCases.GetProduct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private DeleteProduct deleteProduct;

    @Autowired
    private CreateProduct createProduct;

    @Autowired
    private GetProduct getProduct;

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody @Valid ProductRequest request){
        ProductResponse response = createProduct.execute(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable int id){
        ProductResponse response = getProduct.execute(id);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable int id){
        deleteProduct.execute(id);
        return ResponseEntity.noContent().build();
    }

}
