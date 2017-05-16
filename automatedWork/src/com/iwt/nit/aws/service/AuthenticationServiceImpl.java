/**
 * 
 */
package com.iwt.nit.aws.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.iwt.nit.aws.dao.AuthenticationDao;
import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.exception.ServiceException;
import com.iwt.nit.aws.model.User;

/**
 * @author m1012679
 *
 */
public class AuthenticationServiceImpl implements AuthenticationService {
	
	@Autowired
	AuthenticationDao authenticationDao;
	/* (non-Javadoc)
	 * @see com.mindtree.service.AuthenticationService#login(com.mindtree.model.User)
	 */
	@Override
	public User login(User user) throws ServiceException {
		try {
			return authenticationDao.login(user);
		} catch (DaoException e) {
			e.printStackTrace();
			throw new ServiceException("Invalid Username/Password");
		}
	}
}
