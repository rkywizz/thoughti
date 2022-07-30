package com.demo.thoughti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.thoughti.entities.Order;
import com.demo.thoughti.services.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping({"/create"})
    public ResponseEntity<String> addOrder(
                @RequestBody Order od) {
            	orderService.createOrder(od);
            return new ResponseEntity<String>("Order added", HttpStatus.OK);               
         }
	
	@GetMapping({"/orders"})
	public ResponseEntity<List<Order>> getAllOrders(){
		List<Order> ol= orderService.getAllOrders();
		if(ol.isEmpty()) {
			return new ResponseEntity("Sorry No Data", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Order>>(ol, HttpStatus.OK);
	}
	@GetMapping({"/order/{order_id}"})
	public ResponseEntity<Order> findByPk(@PathVariable("order_id")int id){
		Order order= orderService.findById(id);
		if(order==null) {
			return new ResponseEntity("Sorry! Product is not available!", HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
}
