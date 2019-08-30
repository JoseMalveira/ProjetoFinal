package com.cadastro.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cadastro.produto.model.products;

public interface ProductRepository extends JpaRepository<products, Integer>{

}
