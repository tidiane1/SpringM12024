package sn.niit.devspring.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import sn.niit.devspring.model.Categorie;
import sn.niit.devspring.model.Produit;
import sn.niit.devspring.repository.ProduitRepository;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class ProduitServiceImpl implements ProduitService{
    private final ProduitRepository produitRepository;

    @Override
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }
@Cacheable(value = "produits", key = "#produit.id")
    @Override
    public Produit updateProduit(Produit produit, Long id) {
        Optional<Produit> optional = produitRepository.findById(id);
        if(optional.isPresent()){
            Produit updateProduit = optional.get();
            updateProduit.setNom(produit.getNom());
            updateProduit.setDescription(produit.getDescription());
            updateProduit.setPrixUnitaire(produit.getPrixUnitaire());
            updateProduit.setDateFabrication(produit.getDateFabrication());
            updateProduit.setDatePeremption(produit.getDatePeremption());
            return produitRepository.save(updateProduit);
        }
        else{
            throw new RuntimeException("Aucune produit trouvé avec l'id " + id);
        }
    }

    @Override
    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }
    @Cacheable(value = "produits",key = "#id")
    @Override
    public Produit getProduitById(Long id) {
        Optional<Produit> optional = produitRepository.findById(id);
        if(optional.isPresent()){
            Produit updateProduit = optional.get();
            return updateProduit;
        }
        else{
            throw new RuntimeException("Aucune produit trouvé avec l'id " + id);
        }
    }

    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }
}
