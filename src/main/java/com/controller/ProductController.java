package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dao.ProductRepository;
import com.entity.ProductEntity;

@Controller
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("/newproduct")
	public String newProduct() {
		return "NewProduct";

	}

	@PostMapping("/saveproduct")
	public String saveProduct(ProductEntity productEntity) {
		productRepository.save(productEntity);// insert
		return "NewProduct";
	}

	@GetMapping("/products")
	public String getAllProducts(Model model) {
		List<ProductEntity> products = productRepository.findAll();
		model.addAttribute("products",products);
		return "ListProducts";
	}
	
	@GetMapping("/deleteproduct/{productId}")
	public String deleteProduct(@PathVariable("productId")  Integer productId) {
		productRepository.deleteById(productId);
		return "redirect:/products";
	}
	
}
