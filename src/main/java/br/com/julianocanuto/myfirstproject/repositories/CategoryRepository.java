package br.com.julianocanuto.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.julianocanuto.myfirstproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
