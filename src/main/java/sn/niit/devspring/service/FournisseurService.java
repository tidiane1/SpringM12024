package sn.niit.devspring.service;

import sn.niit.devspring.model.Fournisseur;

import java.util.List;

public interface FournisseurService {
    Fournisseur addFournisseur(Fournisseur fournisseur);
    Fournisseur updateFournisseur(Fournisseur fournisseur, Long id);
    void deleteFournisseur(Long id);
    Fournisseur getFournisseurById(Long id);
    List<Fournisseur> getAllFournisseur();
}
