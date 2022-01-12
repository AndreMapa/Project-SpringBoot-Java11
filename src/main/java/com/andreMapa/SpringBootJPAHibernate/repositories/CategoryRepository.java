package com.andreMapa.SpringBootJPAHibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreMapa.SpringBootJPAHibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
