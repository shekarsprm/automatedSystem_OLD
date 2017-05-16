/**
 * 
 */
package com.iwt.nit.aws.dao.impl;

import java.util.List;

import com.iwt.nit.aws.dao.ISolutionDao;
import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.Solution;

/**
 * @author m1012679
 * 
 */
public class SolutionDaoHibernateImpl extends
		GenericDaoHibernateImpl<Solution, Integer> implements ISolutionDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mindtree.dao.ISolutionDao#submitSolution(com.mindtree.model.Solution)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void submitSolution(Solution solution) throws DaoException {
		try {
			System.out.println("Solution : " + solution);
			List<Solution> existingSolution = hibernateTemplate
					.find("from Solution where candidate.candidateId = "
							+ solution.getCandidate().getCandidateId()
							+ " and problem.problemId = "
							+ solution.getProblem().getProblemId());
			if (existingSolution.size()!=0)
				hibernateTemplate.delete(existingSolution.get(0));
			insert(solution);
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		}
	}

}
