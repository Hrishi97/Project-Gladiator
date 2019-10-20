package com.lnt.hr.daos;

import java.util.List;

import com.lnt.hr.beans.Product_Detail;
import com.lnt.hr.exceptions.FinotiveException;

public interface ProductDAO {
	public List<Product_Detail> getProductList() throws FinotiveException;
	public Product_Detail getProductDetails(Integer productId) throws FinotiveException;
//	public PRODUCT_DETAIL insertNewEmployee(PRODUCT_DETAIL prod) throws FinotiveException;
}
