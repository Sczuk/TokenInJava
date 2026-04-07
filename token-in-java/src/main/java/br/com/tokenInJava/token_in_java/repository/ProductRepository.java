package br.com.tokenInJava.token_in_java.repository;

import br.com.tokenInJava.token_in_java.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
