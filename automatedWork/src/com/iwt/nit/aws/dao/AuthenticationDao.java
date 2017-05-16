/**
 * 
 */
package com.iwt.nit.aws.dao;

import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.User;

/**
 * @author m1012679
 *
 */
public interface AuthenticationDao {
	public User login(User user) throws DaoException;
	public void logout() throws DaoException;
}
