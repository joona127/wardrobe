package hh.swd20.wardrobe.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface ClothingRepository extends CrudRepository<Clothing, Long> {
	List<Clothing> findByDescription(String description);
}
