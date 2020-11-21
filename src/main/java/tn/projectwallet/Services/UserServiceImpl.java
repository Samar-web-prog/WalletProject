package tn.projectwallet.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import tn.projectwallet.entities1.user;
import tn.projectwallet.repository.UserRepository;
@Service
public class UserServiceImpl implements IUserService  {
	UserRepository ur;

	@Override
	public List<user> retrieveAllUsers() {
		List <user> ul =(List<user>) ur.findAll();
				return ul;
	}

	@Override
	public List<user> addUser(user u) {
    List <user> ul= (List<user>) ur.save(u);
	return ul;
	}

	@Override
	public void deleteUser(user u) {
 
     ur.deleteById(u.getId());
	}

	@Override
	public List <user> updateUser(user u) {
		 List <user> ul = (List<user>) ur.save(u);
		return ul;
	}

	@Override
	public Optional<user> retrieveUser(int id) {
	Optional<user> u=ur.findById(id);
		return ur.findById(id);
	} 
	
}
