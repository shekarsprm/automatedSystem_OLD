package com.iwt.nit.aws.dao;

import java.util.List;

import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.AssessmentSchedule;

public interface IAssessmentDao {
	public List<AssessmentSchedule > getAllAssignedAssessments(int userId) throws DaoException;

}
