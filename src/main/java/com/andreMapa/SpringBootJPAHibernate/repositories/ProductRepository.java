package com.andreMapa.SpringBootJPAHibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andreMapa.SpringBootJPAHibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
