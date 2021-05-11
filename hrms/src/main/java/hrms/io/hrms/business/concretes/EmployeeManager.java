package hrms.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.io.hrms.business.abstracts.EmployeeService;
import hrms.io.hrms.dataAccess.abstracts.EmployeeDao;
import hrms.io.hrms.entities.concretes.Employee;
@Service
public class EmployeeManager implements EmployeeService{
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		return this.employeeDao.findAll();
	}

}
