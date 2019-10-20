package com.lnt.hr.daos;

import java.util.List;

import com.lnt.hr.beans.PRODUCT_DETAIL;
import com.lnt.hr.exceptions.FinotiveException;

public interface ProductDAO {
	public List<PRODUCT_DETAIL> getProductList() throws FinotiveException;
//	public PRODUCT_DETAIL getProductDetails(Integer prodId) throws FinotiveException;
//	public PRODUCT_DETAIL insertNewEmployee(PRODUCT_DETAIL prod) throws FinotiveException;
}
