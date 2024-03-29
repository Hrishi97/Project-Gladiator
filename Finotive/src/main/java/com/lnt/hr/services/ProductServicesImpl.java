package com.lnt.hr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.hr.beans.Employees;
import com.lnt.hr.beans.Product_Detail;
import com.lnt.hr.daos.EmpDao;
import com.lnt.hr.daos.ProductDAO;
import com.lnt.hr.exceptions.EmpException;
import com.lnt.hr.exceptions.FinotiveException;

@Service("productServices")
@Scope("singleton")
@Transactional(propagation=Propagation.REQUIRES_NEW)
public class ProductServicesImpl implements ProductServices {

	@Autowired
	private ProductDAO dao;
	
	@Override
	public List<Product_Detail> getProductList() throws FinotiveException {
		return dao.getProductList();
	}

	@Override
	public Product_Detail getProductDetails(Integer productId) throws FinotiveException {
		// TODO Auto-generated method stub
		return dao.getProductDetails(productId);
	}
}
