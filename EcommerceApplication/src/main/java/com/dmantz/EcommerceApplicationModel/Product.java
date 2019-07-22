package com.dmantz.EcommerceApplicationModel;

import java.util.List;

public class Product {
	
	

	private Integer productId;
	
	private String productName;
	
	private String productDesc;
	
	private String searchTag;
	
	private List<Options> optionProduct;

	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", searchTag=" + searchTag + "]";
	}
	
	
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getSearchTag() {
		return searchTag;
	}

	public void setSearchTag(String searchTag) {
		this.searchTag = searchTag;
	}

	public List<Options> getOptionProduct() {
		return optionProduct;
	}

	public void setOptionProduct(List<Options> string) {
		this.optionProduct = string;
	}
	

}
