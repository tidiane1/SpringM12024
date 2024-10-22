package sn.niit.devspring.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import sn.niit.devspring.model.Fournisseur;

public interface  FournisseurRepository extends JpaRepository<Fournisseur, Long> {
}
