package com.nagarro.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.model.Order;
import com.nagarro.serviceimpl.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping(value = "/{email_id}")
	public List<Order> getOrder(@PathVariable(name = "email_id") String email_id){
		return orderService.getOrder(email_id);
	}

}
