package br.madeinastec.service;

import br.madeinastec.domain.ShippingAddress;
import br.madeinastec.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
