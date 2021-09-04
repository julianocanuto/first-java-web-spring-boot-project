package br.com.julianocanuto.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.julianocanuto.myfirstproject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
