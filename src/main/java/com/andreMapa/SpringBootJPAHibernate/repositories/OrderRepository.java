package com.andreMapa.SpringBootJPAHibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andreMapa.SpringBootJPAHibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
