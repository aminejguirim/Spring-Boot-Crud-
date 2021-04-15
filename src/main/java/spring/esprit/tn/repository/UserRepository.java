package spring.esprit.tn.repository;

import org.springframework.data.repository.CrudRepository;

import spring.esprit.tn.entity.User;



public interface UserRepository extends CrudRepository<User, Long> {

}
