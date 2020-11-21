package tn.projectwallet.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.projectwallet.entities1.user;

@Repository
public interface UserRepository extends CrudRepository<user,Integer>{

}
