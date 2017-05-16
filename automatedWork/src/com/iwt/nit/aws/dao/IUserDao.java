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
public interface IUserDao {
	public User getUserById(Integer id) throws DaoException;
	public void deleteUser(User user) throws DaoException;
	public User addUser(User user) throws DaoException;
}
