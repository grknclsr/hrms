package hrms.io.hrms.business.abstracts;

import java.util.List;

import hrms.io.hrms.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
}
