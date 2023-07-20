package com.springcore.GroceryHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "`order`")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int order_id;
	private int userid;
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	private List<Product> products = new ArrayList<Product>();
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Order() {
		super();
	}
	
}
