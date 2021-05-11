package hrms.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.io.hrms.business.abstracts.UserService;
import hrms.io.hrms.dataAccess.abstracts.UserDao;
import hrms.io.hrms.entities.concretes.User;

@Service
public class UserManger implements UserService{
	private UserDao userDao;
	
	@Autowired
	public UserManger(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.findAll();
	}

}
