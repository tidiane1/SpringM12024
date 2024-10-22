package sn.niit.devspring.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.niit.devspring.model.Personne;


public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
