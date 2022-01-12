package com.andreMapa.SpringBootJPAHibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andreMapa.SpringBootJPAHibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
