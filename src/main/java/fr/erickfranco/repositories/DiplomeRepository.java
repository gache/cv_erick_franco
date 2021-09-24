package fr.erickfranco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.erickfranco.model.Diplome;

@Repository
public interface DiplomeRepository extends JpaRepository<Diplome, Long> {

}
