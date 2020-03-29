package com.nagarro.serviceimpl;

import java.util.List;

import com.nagarro.model.Order;

public interface OrderService {
	public List<Order> getOrder(String email_id);

}
 