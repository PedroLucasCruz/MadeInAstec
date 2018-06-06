package br.madeinastec.service;

import br.madeinastec.domain.BillingAddress;
import br.madeinastec.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setarPeloFaturamento(UserBilling userBilling, BillingAddress billingAddress);
}
