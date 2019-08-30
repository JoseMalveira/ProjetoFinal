package com.cadastro.produto.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cadastro.produto.model.products;
import com.cadastro.produto.repository.ProductRepository;

@Service
@Transactional
public class ProductsDAO {
	@Autowired
	private ProductRepository repo;

	public List<products> listall() {
		return repo.findAll();
	}

	public products get(Integer id) {
		return repo.findById(id).get();
	}

	public void save(products pro) {
		repo.save(pro);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}