package sn.niit.devspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.niit.devspring.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
