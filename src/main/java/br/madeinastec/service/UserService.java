package br.madeinastec.service;

import java.util.Set;

import br.madeinastec.domain.User;
import br.madeinastec.domain.UserBilling;
import br.madeinastec.domain.UserPayment;
import br.madeinastec.domain.UserShipping;
import br.madeinastec.domain.security.PasswordResetToken;
import br.madeinastec.domain.security.UserRole;

public interface UserService {
    
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User findById(Long id);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);
}
