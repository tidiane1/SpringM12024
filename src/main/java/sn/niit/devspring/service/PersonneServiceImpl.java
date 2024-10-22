package sn.niit.devspring.service;

import org.springframework.stereotype.Service;
import sn.niit.devspring.model.Personne;
import sn.niit.devspring.repository.PersonneRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneServiceImpl implements PersonneService{
   private final PersonneRepository personneRepository;

    public PersonneServiceImpl(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    @Override
    public List<Personne> getAllPersonne() {
        return personneRepository.findAll();
    }

    @Override
    public Personne getPersonneById(Long id) {
        Optional<Personne> optional = personneRepository.findById(id);
        if(optional.isPresent()){
            Personne personne = optional.get();
            return personne;
        }
        else {
            throw new RuntimeException();
        }

    }

    @Override
    public Personne savePersonne(Personne personne) {
        return personneRepository.save(personne);
    }

    @Override
    public Personne updatePersonne(Personne personne, Long id) {
        Optional<Personne> optional = personneRepository.findById(id);
        if(optional.isPresent()){
            Personne updatePersonne = optional.get();
            updatePersonne.setPrenom(personne.getPrenom());
            updatePersonne.setNom(personne.getNom());
            return personneRepository.save(updatePersonne);
        }
        else {
            throw new RuntimeException();
        }
    }

    @Override
    public void deletePersonne(Long id) {
        personneRepository.deleteById(id);
    }
}
