package com.felipeosilva.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeosilva.course1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
