package com.nagarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.model.Order;
import com.nagarro.repository.OrderRepository;
import com.nagarro.serviceimpl.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Order> getOrder(String email_id) {
		// TODO Auto-generated method stub
		return orderRepository.getOrder(email_id);
	}

}
