package com.crudbynativesql.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.crudbynativesql.entity.Product;

import jakarta.transaction.Transactional;

public interface ProductRepository extends JpaRepository<Product, String>{
	
	@Modifying
	@Transactional
	@Query(value = "insert into product_table values(?1,?2,?3,?4,?5)", nativeQuery=true)
	int addItems(String productId, String productName, String productDescription, String productCategory, String productBand);
	
	@Query(value = "select * from product_table where product_id = ?1", nativeQuery=true)
	Optional<Product> getItem(String productId);
	
	@Query(value = "select * from product_table", nativeQuery=true)
	List<Product> getAllIteams();
	
	@Modifying
	@Transactional
	@Query(value = "delete from product_table where product_id = ?1",nativeQuery = true)
	int deleteItem(String productId);
	
	@Modifying
	@Transactional
	@Query(value = "update product_table set product_name = ?2 where product_id = ?1",nativeQuery = true)
	int updateItem(String product_id,String product_name);
}
