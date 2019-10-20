package com.lnt.hr.daos;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.lnt.hr.beans.PRODUCT_DETAIL;
import com.lnt.hr.exceptions.FinotiveException;

@Repository
@Scope("singleton")
@Transactional(propagation = Propagation.REQUIRED)
public class ProductDAOImpl implements ProductDAO {

	@PersistenceContext
	EntityManager manager;

	@PostConstruct
	public void init() {
		if (manager == null) {
			System.err.println("NULL");
		}
		else {
			System.out.println("Success");
		}
	}

	public List<PRODUCT_DETAIL> getProductList() throws FinotiveException {
		Query query = manager.createNamedQuery("getProductList");
		@SuppressWarnings("unchecked")
		List<PRODUCT_DETAIL> list = query.getResultList();
		return list;
	}

	
}
