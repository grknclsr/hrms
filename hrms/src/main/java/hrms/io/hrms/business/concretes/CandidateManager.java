package hrms.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.io.hrms.business.abstracts.CandidateService;
import hrms.io.hrms.dataAccess.abstracts.CandidateDao;
import hrms.io.hrms.entities.concretes.Candidate;
@Service
public class CandidateManager implements CandidateService{
	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public List<Candidate> getAll() {
		return this.candidateDao.findAll();
	}

}
