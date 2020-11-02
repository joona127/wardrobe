package hh.swd20.wardrobe.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface OwnerRepository extends CrudRepository<Owner, Long> {
	List<Owner> findByName(String name);
}

