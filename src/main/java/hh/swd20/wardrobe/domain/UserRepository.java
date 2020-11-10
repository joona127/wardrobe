package hh.swd20.wardrobe.domain;

import org.springframework.data.repository.CrudRepository;

import hh.swd20.wardrobe.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
