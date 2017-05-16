package com.iwt.nit.aws.dao.impl;


import com.iwt.nit.aws.dao.IScoreDao;
import com.iwt.nit.aws.exception.ApplicationException;
import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.Score;

public class ScoreDaoHibernateImpl extends GenericDaoHibernateImpl<Score, Integer> implements IScoreDao{

	@Override
	public void submitScore(Score score) throws DaoException {
		try {
			insert(score);
		} catch (ApplicationException e) {
			throw new DaoException("Source code can be submitted only once against a problem statement");
		}
		
	}

	

}
