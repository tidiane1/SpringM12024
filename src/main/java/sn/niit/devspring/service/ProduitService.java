package sn.niit.devspring.service;

import sn.niit.devspring.model.Categorie;
import sn.niit.devspring.model.Produit;

import java.util.List;

public interface ProduitService {
    Produit addProduit(Produit produit);
    Produit updateProduit(Produit produit, Long id);
    void deleteProduit(Long id);
    Produit getProduitById(Long id);
    List<Produit> getAllProduit();
}
