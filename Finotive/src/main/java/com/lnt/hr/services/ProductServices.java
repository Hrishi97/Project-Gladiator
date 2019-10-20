package com.lnt.hr.services;

import java.util.List;

import com.lnt.hr.beans.Employees;
import com.lnt.hr.beans.PRODUCT_DETAIL;
import com.lnt.hr.exceptions.EmpException;
import com.lnt.hr.exceptions.FinotiveException;

public interface ProductServices {
	public List<PRODUCT_DETAIL> getProductList() throws FinotiveException;
//	public PRODUCT_DETAIL getProductDetails(Integer prodId) throws FinotiveException;
//	public PRODUCT_DETAIL insertNewEmployee(PRODUCT_DETAIL prod) throws FinotiveException;
}
