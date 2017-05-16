package com.iwt.nit.aws.service;

import java.util.List;

import com.iwt.nit.aws.exception.ServiceException;
import com.iwt.nit.aws.model.AssessmentSchedule;
import com.iwt.nit.aws.model.Score;
import com.iwt.nit.aws.model.Solution;
import com.iwt.nit.aws.model.TestCase;

public interface ITestTakerService {
	public List<AssessmentSchedule> getAllAssignedAssessments(int userId)
			throws ServiceException;

	public void submitSolution(Solution solution) throws ServiceException;
	
	public List<TestCase> getTestCasesForProblem(int problemId) throws ServiceException;
	
	public void submitScore(Score score) throws ServiceException;

}
