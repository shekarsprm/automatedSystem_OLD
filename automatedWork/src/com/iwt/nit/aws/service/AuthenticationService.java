/**
 * 
 */
package com.iwt.nit.aws.service;

import com.iwt.nit.aws.exception.ServiceException;
import com.iwt.nit.aws.model.User;

/**
 * @author m1012679
 *
 */
public interface AuthenticationService {
	public User login(User user) throws ServiceException;
}
