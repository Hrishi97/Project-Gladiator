package com.lnt.hr.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lnt.hr.beans.Product_Detail;
import com.lnt.hr.exceptions.FinotiveException;
import com.lnt.hr.services.ProductServices;

@Controller
public class MainController {

	@Resource
	private ProductServices productServices;

	@RequestMapping("/home.hr")
	public String HomePage() {
		return "Home";
	}

	ModelAndView mv = null;

	@RequestMapping("/productList.hr")
	public ModelAndView getProductList() {
		List<Product_Detail> productList = null;

		try {
			productList = productServices.getProductList();
			mv = new ModelAndView();
			mv.setViewName("ProductList");
			mv.addObject("productList", productList);
		} catch (FinotiveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

	@RequestMapping("/productDetails.hr")
	public ModelAndView getProductDetails(@RequestParam("id") int productID) {

		try {
			Product_Detail productDetail = null;
			productDetail = productServices.getProductDetails(productID);
			mv = new ModelAndView();
			mv.setViewName("ProductDetails");
			mv.addObject("productDetail", productDetail);
		} catch (FinotiveException e) {
			e.printStackTrace();
		}
		return mv;
	}
}
