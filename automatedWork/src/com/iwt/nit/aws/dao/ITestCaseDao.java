/**
 * 
 */
package com.iwt.nit.aws.dao;

import java.util.List;

import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.TestCase;

/**
 * @author m1012679
 *
 */
public interface ITestCaseDao {
	public void addTestCase(TestCase testCase) throws DaoException;
	public List<TestCase> getTestCasesForProblem(int problemId) throws DaoException;
}
