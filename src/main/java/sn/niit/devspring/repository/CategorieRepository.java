package sn.niit.devspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.niit.devspring.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
