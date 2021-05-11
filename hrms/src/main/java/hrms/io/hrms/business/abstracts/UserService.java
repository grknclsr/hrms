package hrms.io.hrms.business.abstracts;

import java.util.List;

import hrms.io.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}
