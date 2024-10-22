package sn.niit.devspring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import sn.niit.devspring.model.Categorie;
import sn.niit.devspring.repository.CategorieRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategorieServiceImpl implements CategorieService{
    private final CategorieRepository categorieRepository;

    @Override
    public Categorie addCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }
@Cacheable(value = "categorie", key = "#categorie.id")
    @Override
    public Categorie updateCategorie(Categorie categorie, Long id) {
        Optional<Categorie> optional = categorieRepository.findById(id);
        if(optional.isPresent()){
            Categorie updateCategorie = optional.get();
            updateCategorie.setNom(categorie.getNom());
            updateCategorie.setDescription(categorie.getDescription());
            return categorieRepository.save(updateCategorie);
        }
        else{
            throw new RuntimeException("Aucune categorie trouvée avec l'id " + id);
        }
    }

    @Override
    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }

    @Override@Cacheable(value = "categorie", key = "#id")

    public Categorie getCategorieById(Long id) {
        Optional<Categorie> optional = categorieRepository.findById(id);
        if(optional.isPresent()){
            Categorie myCategorie = optional.get();
           return myCategorie;
        }
        else{
            throw new RuntimeException("Aucune categorie trouvée avec l'id " + id);
        }
    }

    @Override
    public List<Categorie> getAllCategorie() {
        return categorieRepository.findAll();
    }
}
