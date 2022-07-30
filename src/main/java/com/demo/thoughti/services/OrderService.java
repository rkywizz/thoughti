package com.demo.thoughti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.thoughti.entities.Order;
import com.demo.thoughti.repository.OrderDao;

@Service
public class OrderService {
		
		@Autowired
		private OrderDao orderDao;
		
		public void createOrder(Order o) {
				orderDao.saveAndFlush(o);
		}
		public Order findById(int id) {
			Order order=orderDao.findById(id).get();
			return order;
		}
		public List<Order> getAllOrders(){
			List<Order> orderList=orderDao.findAll();
			return orderList;
		}
}
