package com.iwt.nit.aws.dao;

import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.Score;

public interface IScoreDao {
	public void submitScore(Score score) throws DaoException;
}
