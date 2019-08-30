package com.cadastro.produto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cadastro.produto.dao.ProductsDAO;
import com.cadastro.produto.model.products;


@Controller
public class ProdController {
	
	
	
	@Autowired   //injeção de dependencia
	private ProductsDAO service;
	
	
	@RequestMapping("/novo")
	public String showNewProductPage(Model model) {
		products product = new products();
		model.addAttribute("product", product);
		return "/new_product";
	}
	
	@GetMapping("/list")
	public String listar(Model model) {
		//List<ProductModel> listProducts = service.listall();		
		model.addAttribute("listproduct", service.listall());
		return "/list";
	}
	
	@PostMapping("/save")
	public String save(products products) {
		//List<ProductModel> listProducts = service.listall();
		service.save(products);
		return "redirect:/list";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name="id") int id) {
		ModelAndView mav = new ModelAndView("edit");
		products product = service.get(id);
		mav.addObject("product", product);
		return mav;
	}
	
	@PostMapping("/saveEdit/{id}")
	public String edit(products products,@PathVariable(name="id") int id) {
		//List<ProductModel> listProducts = service.listall();
		products.setId(id);
		service.save(products);
		return "redirect:/list";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name="id") int id) {
		service.delete(id);
		return "redirect:/list";
	}
	
	
	
	
}

