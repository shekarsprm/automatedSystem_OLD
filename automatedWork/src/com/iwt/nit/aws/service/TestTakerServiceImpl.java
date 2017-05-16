package com.iwt.nit.aws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iwt.nit.aws.dao.IAssessmentDao;
import com.iwt.nit.aws.dao.IScoreDao;
import com.iwt.nit.aws.dao.ISolutionDao;
import com.iwt.nit.aws.dao.ITestCaseDao;
import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.exception.ServiceException;
import com.iwt.nit.aws.model.AssessmentSchedule;
import com.iwt.nit.aws.model.Score;
import com.iwt.nit.aws.model.Solution;
import com.iwt.nit.aws.model.TestCase;

public class TestTakerServiceImpl implements ITestTakerService {

	@Autowired
	private IAssessmentDao assessmentDao;

	@Autowired
	private ISolutionDao solutionDao;
	
	@Autowired
	private ITestCaseDao testCaseDao;
	
	@Autowired
	private IScoreDao scoreDao;

	@Override
	public List<AssessmentSchedule> getAllAssignedAssessments(int userId)
			throws ServiceException {
		try {
			return assessmentDao.getAllAssignedAssessments(userId);
		} catch (DaoException e) {
			e.printStackTrace();
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public void submitSolution(Solution solution) throws ServiceException {
		try {
			solutionDao.submitSolution(solution);
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public List<TestCase> getTestCasesForProblem(int problemId)
			throws ServiceException {
		try {
			return testCaseDao.getTestCasesForProblem(problemId);
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public void submitScore(Score score) throws ServiceException {
		try {
			scoreDao.submitScore(score);
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage());
		}
		
	}

}
