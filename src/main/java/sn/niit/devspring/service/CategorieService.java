package sn.niit.devspring.service;

import sn.niit.devspring.model.Categorie;

import java.util.List;

public interface CategorieService {
    Categorie addCategorie(Categorie categorie);
    Categorie updateCategorie(Categorie categorie, Long id);
    void deleteCategorie(Long id);
    Categorie getCategorieById(Long id);
    List<Categorie> getAllCategorie();
}
