package com.lnt.hr.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lnt.hr.beans.Product_Detail;
import com.lnt.hr.daos.ProductDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:hr-core.xml")
public class test_jdbc {

	@Autowired
	private ProductDAO dao;
	
	@Test
	public void testSomething() throws Exception {
		List<Product_Detail> list = dao.getProductList();
		assertNotNull(list);
		assertEquals(2, list.size());
	}
	
}
