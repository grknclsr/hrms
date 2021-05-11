package hrms.io.hrms.business.abstracts;

import java.util.List;

import hrms.io.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}
