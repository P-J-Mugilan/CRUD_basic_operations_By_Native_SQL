package com.crudbynativesql;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crudbynativesql.entity.Product;
import com.crudbynativesql.repository.ProductRepository;

@SpringBootTest
class CrudbynativesqlApplicationTests {

	@Autowired
	ProductRepository productRepository;
	
	Product product;
	
	@BeforeEach
	void createBean() {
		product = new Product();
	}
	
	@Test
	void addProduct() {
		int result = productRepository.addItems(
				"1078",
				"head and Shoulder",
				"hair product shampoo",
				"shampoo",
				"head and shoulder"
				);
		System.out.println(result +" row affected");
	}
	
	@Test
	void deleteItemById() {
		int result = productRepository.deleteItem("1078");
		System.out.println(result +" row affected");
	}
	
	@Test
	void updateItemById() {
		int result = productRepository.updateItem("1001", "chinthol");
		System.out.println(result +" row affected");
	}
	
	@Test
	void getItemById() {
		Optional<Product> pro = productRepository.getItem("1001");
		System.out.println(pro.get().getProductId());
		System.out.println(pro.get().getProductName());
		System.out.println(pro.get().getProductDescription());
		System.out.println(pro.get().getProductCategory());
		System.out.println(pro.get().getProductBand());
	}
	
	@Test
	void getItems() {
		List<Product> products = productRepository.getAllIteams();
		
		for(Product pro : products) {
			System.out.println(pro.getProductId());
			System.out.println(pro.getProductName());
			System.out.println(pro.getProductDescription());
			System.out.println(pro.getProductCategory());
			System.out.println(pro.getProductBand());
			System.out.println("-------------------------------------");
		}
	}

}
