/**
 * 
 */
package com.iwt.nit.aws.dao;

import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.AssessmentSchedule;

/**
 * @author m1012679
 *
 */
public interface IScheduleAssessmentDao {
	public void scheduleAnAssessment(AssessmentSchedule assessmentSchedule) throws DaoException;
	public void updateAssessment(AssessmentSchedule assessmentSchedule) throws DaoException;
	public int getScheduleId(AssessmentSchedule assessmentSchedule) throws DaoException;
}
