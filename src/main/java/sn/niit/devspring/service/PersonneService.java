package sn.niit.devspring.service;

import sn.niit.devspring.model.Personne;

import java.util.List;

public interface PersonneService {
    List<Personne> getAllPersonne();
    Personne getPersonneById(Long id);
    Personne savePersonne(Personne personne);
    Personne updatePersonne(Personne personne, Long id);
    void deletePersonne(Long id);
}
