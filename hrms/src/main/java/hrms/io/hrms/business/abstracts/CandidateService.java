package hrms.io.hrms.business.abstracts;

import java.util.List;

import hrms.io.hrms.entities.concretes.Candidate;

public interface CandidateService {
	List<Candidate> getAll();
}
