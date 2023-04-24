package api.oracle.jpa.poc.api.oracle.jpa.poc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import api.oracle.jpa.poc.api.oracle.jpa.poc.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
    List<User> findByEmail(String email);

    User findById(long id);
}
