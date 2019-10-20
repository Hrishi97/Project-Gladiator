package com.lnt.hr.beans;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="getProductList",query="from PRODUCT_DETAIL")
})

@Entity
@Table(name="PRODUCT_DETAIL")
public class PRODUCT_DETAIL {

	private Integer product_id;
	private String product_name;
	private String product_cost;
	private String product_all_details;
	private String product_brief_details;
	private Blob imageblob;
	
	@Id
	@Column(name="PRODUCT_ID")
	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	
	@Column(name="PRODUCT_NAME")
	public String getProduct_name() {
		return product_name;
	}

	
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	@Column(name="PRODUCT_COST")
	public String getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(String product_cost) {
		this.product_cost = product_cost;
	}

	@Column(name="PRODUCT_ALL_DETAILS")
	public String getProduct_all_details() {
		return product_all_details;
	}

	public void setProduct_all_details(String product_all_details) {
		this.product_all_details = product_all_details;
	}

	@Column(name="PRODUCT_BRIEF_DETAILS")
	public String getProduct_brief_details() {
		return product_brief_details;
	}

	public void setProduct_brief_details(String product_brief_details) {
		this.product_brief_details = product_brief_details;
	}

	@Column(name="PRODUCT_IMAGE")
	public Blob getImageblob() {
		return imageblob;
	}

	public void setImageblob(Blob imageblob) {
		this.imageblob = imageblob;
	}

	@Override
	public String toString() {
		return "PRODUCT_DETAIL [product_id=" + product_id + ", product_name=" + product_name + ", product_cost="
				+ product_cost + ", product_all_details=" + product_all_details + ", product_brief_details="
				+ product_brief_details + ", imageblob=" + imageblob + "]";
	}

	public PRODUCT_DETAIL(Integer product_id, String product_name, String product_cost, String product_all_details,
			String product_brief_details, Blob imageblob) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_cost = product_cost;
		this.product_all_details = product_all_details;
		this.product_brief_details = product_brief_details;
		this.imageblob = imageblob;
	}

	public PRODUCT_DETAIL() {
		super();
	}
}
