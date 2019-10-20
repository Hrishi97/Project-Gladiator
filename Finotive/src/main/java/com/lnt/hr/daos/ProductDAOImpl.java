package com.lnt.hr.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.lnt.hr.beans.Product_Detail;
import com.lnt.hr.exceptions.FinotiveException;

@Repository
@Scope("singleton")
@Transactional(propagation = Propagation.REQUIRED)
public class ProductDAOImpl implements ProductDAO {

	@PersistenceContext
	EntityManager manager;

	public List<Product_Detail> getProductList() throws FinotiveException {
		Query query = manager.createNamedQuery("getProductList");
		@SuppressWarnings("unchecked")
		List<Product_Detail> list = query.getResultList();
		return list;
	}

	@Override
	public Product_Detail getProductDetails(Integer productId) throws FinotiveException {
		Product_Detail productDetail = manager.find(Product_Detail.class, productId);
		return productDetail;
	}
}
