package br.madeinastec.service.impl;

import org.springframework.stereotype.Service;

import br.madeinastec.domain.BillingAddress;
import br.madeinastec.domain.UserBilling;
import br.madeinastec.service.BillingAddressService;

@Service
public class BillingAddressServiceImpl implements BillingAddressService{
	
	public BillingAddress setarPeloFaturamento(UserBilling userBilling, BillingAddress enderecoDeCobranca) {
		enderecoDeCobranca.setBillingAddressName(userBilling.getUserBillingName());
		enderecoDeCobranca.setBillingAddressStreet1(userBilling.getUserBillingStreet1());
		enderecoDeCobranca.setBillingAddressStreet2(userBilling.getUserBillingStreet2());
		enderecoDeCobranca.setBillingAddressCity(userBilling.getUserBillingCity());
		enderecoDeCobranca.setBillingAddressState(userBilling.getUserBillingState());
		enderecoDeCobranca.setBillingAddressCountry(userBilling.getUserBillingCountry());
		enderecoDeCobranca.setBillingAddressZipcode(userBilling.getUserBillingZipcode());
		
		return enderecoDeCobranca;
	}

}
