package com.demo.thoughti.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Order")
public class Order {
	
	@Id
	@GeneratedValue
	private int orderId;
	
	private String orderDate;
	
	private String orderStatus;
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Item> itemlist;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Set<Item> getItemlist() {
		return itemlist;
	}
	public void setItemlist(Set<Item> itemlist) {
		this.itemlist = itemlist;
	}
	
}
