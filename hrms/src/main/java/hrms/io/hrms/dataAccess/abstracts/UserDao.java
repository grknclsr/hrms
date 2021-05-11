package hrms.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.io.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
}
