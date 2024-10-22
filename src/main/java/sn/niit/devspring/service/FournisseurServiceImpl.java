package sn.niit.devspring.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.niit.devspring.model.Fournisseur;
import sn.niit.devspring.repository.FournisseurRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FournisseurServiceImpl implements FournisseurService {
    private final FournisseurRepository fournisseurRepository;

    @Override
    public Fournisseur addFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur fournisseur, Long id) {
        Optional<Fournisseur> optional = fournisseurRepository.findById(id);
        if(optional.isPresent()){
            Fournisseur updateFournisseur = optional.get();
            updateFournisseur.setNom(fournisseur.getNom());
            updateFournisseur.setPrenom(fournisseur.getPrenom());
            return fournisseurRepository.save(updateFournisseur);
        }
        else{
            throw new RuntimeException("Aucune fournisseur trouvée avec l'id " + id);
        }
    }

    @Override
    public void deleteFournisseur(Long id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public Fournisseur getFournisseurById(Long id) {
        Optional<Fournisseur> optional = fournisseurRepository.findById(id);
        if(optional.isPresent()){
            Fournisseur myFournisseur = optional.get();
            return myFournisseur;
        }
        else{
            throw new RuntimeException("Aucune fournisseur trouvée avec l'id " + id);
        }
    }

    @Override
    public List<Fournisseur> getAllFournisseur() {
        return fournisseurRepository.findAll();
    }
}
