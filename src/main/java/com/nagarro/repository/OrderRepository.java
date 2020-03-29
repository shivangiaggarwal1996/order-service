package com.nagarro.repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nagarro.model.Order;


@Repository
public class OrderRepository {
	
	HashMap<String, List<Order>> orderMap = new HashMap<String, List<Order>>() {{
		put("john@gmail.com", new ArrayList<Order>() {{
			add(new Order("1", "2900", "14-Apr-2020"));
			add(new Order("4", "378.9", "30-march-2020"));
		}} );
		put("joe@gmail.com", new ArrayList<Order>() {{
			add(new Order("2","6789","15-Apr-2020"));
			add(new Order("3","250","19-Apr-2020"));
		}});
	}}; 

	
	public List<Order> getOrder(String email_id){
		List<Order> order = null;
		if(orderMap.containsKey(email_id)) {
			order = orderMap.get(email_id) ;
		}
		
		return order;
		
		
	}
}
