/**
 * 
 */
package com.iwt.nit.aws.dao.impl;

import java.util.List;

import com.iwt.nit.aws.dao.IGroupDao;
import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.Group;

/**
 * @author m1012679
 * 
 */
public class GroupDaoImpl extends GenericDaoHibernateImpl<Group, Integer>
		implements IGroupDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mindtree.dao.IGroupDao#getAllGroups()
	 */
	@Override
	public List<Group> getAllGroups() throws DaoException {
		try {
			return getAll(Group.class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException("Unable to get groups");
		}
	}

	@Override
	public void addGroup(Group group) throws DaoException {
		insert(group);
	}

	@Override
	public Group getGroupById(Integer id) throws DaoException {
		Group group = (Group) getEntity(Group.class, id);
		return group;
	}
}
