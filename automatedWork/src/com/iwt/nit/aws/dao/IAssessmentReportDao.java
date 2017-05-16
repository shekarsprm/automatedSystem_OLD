/**
 * 
 */
package com.iwt.nit.aws.dao;

import java.util.List;

import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.AssessmentReport;
import com.iwt.nit.aws.model.AssessmentSchedule;

/**
 * @author M1012679
 *
 */
public interface IAssessmentReportDao {
	public List<AssessmentReport> getAssessmentReport(AssessmentSchedule assessmentSchedule) throws DaoException;
	public List<AssessmentReport> getAllAssessmentReport() throws DaoException;
}
