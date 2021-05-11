package hrms.io.hrms.business.abstracts;

import java.util.List;

import hrms.io.hrms.entities.concretes.Employee;

public interface EmployeeService {
	List<Employee> getAll();
}
