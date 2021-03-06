/**
 * 
 */
package com.iwt.nit.aws.dao.impl;

import java.util.List;

import com.iwt.nit.aws.dao.CandidateDao;
import com.iwt.nit.aws.dao.impl.GenericDaoHibernateImpl;
import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.Candidate;

/**
 * @author m1012776 This class implements the methods in CandidateDao
 */
public class CandidateDaoHibernateImpl extends
		GenericDaoHibernateImpl<Candidate, Integer> implements CandidateDao {

	@Override
	public void addCandidate(Candidate candidate) throws DaoException {
		try {
			insert(candidate);
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		}
	}

	@Override
	public List<Candidate> getAllCandidates() throws DaoException {
		return (List<Candidate>) getAll(Candidate.class);
	}

	@Override
	public Candidate getCandidateById(Integer id) throws DaoException {
		Candidate candidate = (Candidate) getEntity(Candidate.class, id);
		return candidate;
	}

	@Override
	public void associateCandidateWithGroup(Candidate candidate)
			throws DaoException {
		merge(candidate);
	}

	@Override
	public Candidate getCandidateByUserId(Integer id) throws DaoException {
		List candidateDetails = hibernateTemplate.find("from Candidate where user.userId ="+id);
		Candidate candidate =null;
		if(candidateDetails!=null){
			 candidate = (Candidate) candidateDetails.get(0);
		}
		return candidate;
	}

	
	
}
