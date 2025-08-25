package com.crudbynativesql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "product_table")
public class Product {
	
	@Id
	@Column(name = "product_id", length = 10)
	private String productId;
	
	@Column(name = "product_name" , nullable = false, length = 45)
	private String productName;
	
	@Column(name = "product_description" , nullable = false, length = 90)
	private String productDescription;
	
	@Column(name = "product_category" , nullable = false, length = 45)
	private String productCategory;
	
	@Column(name = "product_band" , nullable = false, length = 25)
	private String productBand;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductBand() {
		return productBand;
	}

	public void setProductBand(String productBand) {
		this.productBand = productBand;
	}
	
	
}
