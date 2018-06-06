package br.madeinastec.service;

import br.madeinastec.domain.BillingAddress;
import br.madeinastec.domain.Order;
import br.madeinastec.domain.Payment;
import br.madeinastec.domain.ShippingAddress;
import br.madeinastec.domain.ShoppingCart;
import br.madeinastec.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
