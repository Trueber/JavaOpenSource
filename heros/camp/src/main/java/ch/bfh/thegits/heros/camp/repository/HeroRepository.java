package ch.bfh.thegits.heros.camp.repository;

import ch.bfh.thegits.heros.camp.model.Hero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HeroRepository extends CrudRepository<Hero, String> {
    Long countByAtkGreaterThan(int atk);
}
