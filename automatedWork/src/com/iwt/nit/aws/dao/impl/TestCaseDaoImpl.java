/**
 * 
 */
package com.iwt.nit.aws.dao.impl;

import java.util.List;

import com.iwt.nit.aws.dao.ITestCaseDao;
import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.TestCase;

/**
 * @author m1012679
 *
 */
public class TestCaseDaoImpl extends GenericDaoHibernateImpl<TestCase, Integer> implements ITestCaseDao {

	@Override
	public void addTestCase(TestCase testCase) throws DaoException {
		insert(testCase);
	}

	@Override
	public List<TestCase> getTestCasesForProblem(int problemId)
			throws DaoException {
		try {
			return hibernateTemplate.find("from TestCase where problem.problemId = "+problemId);
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		}
	}

}
