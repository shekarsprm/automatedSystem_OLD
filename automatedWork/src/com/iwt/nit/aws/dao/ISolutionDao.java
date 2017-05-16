/**
 * 
 */
package com.iwt.nit.aws.dao;



import com.iwt.nit.aws.exception.DaoException;
import com.iwt.nit.aws.model.Score;
import com.iwt.nit.aws.model.Solution;


/**
 * @author m1012679
 *
 */
public interface ISolutionDao {
	public void submitSolution(Solution solution) throws DaoException;
	
	
}
