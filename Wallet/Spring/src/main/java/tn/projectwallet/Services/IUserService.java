package tn.projectwallet.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import tn.projectwallet.entities1.user;

public interface IUserService {
	List<user> retrieveAllUsers();
	List<user> addUser(user u);
	void deleteUser(user u);
	List<user> updateUser(user u);
	Optional<user> retrieveUser(int id);
	 
}
