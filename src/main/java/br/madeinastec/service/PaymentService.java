package br.madeinastec.service;

import br.madeinastec.domain.Payment;
import br.madeinastec.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
