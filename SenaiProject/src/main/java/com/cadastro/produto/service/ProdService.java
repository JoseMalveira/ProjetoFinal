package com.cadastro.produto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cadastro.produto.repository.ProductRepository;
import com.cadastro.produto.model.products;
@Service
@Transactional
public class ProdService {
	@Autowired
	private  ProductRepository repo;
	
	public List<products> findAll(){
		return repo.findAll();
	}
	
	public products find(int id){
		return repo.findById(id).get();
	}
	
	public products save(products products) {
		return repo.save(products);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
