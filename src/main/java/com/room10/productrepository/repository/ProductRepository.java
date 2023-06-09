package com.room10.productrepository.repository;

import com.room10.productrepository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProductRepository")
public interface ProductRepository extends JpaRepository<Product, String > {
}

