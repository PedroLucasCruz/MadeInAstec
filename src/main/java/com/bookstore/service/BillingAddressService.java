package com.bookstore.service;

import com.bookstore.domain.BillingAddress;
import com.bookstore.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setarPeloFaturamento(UserBilling userBilling, BillingAddress billingAddress);
}
