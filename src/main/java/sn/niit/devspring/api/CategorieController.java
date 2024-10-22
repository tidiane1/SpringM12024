package sn.niit.devspring.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.niit.devspring.model.Categorie;
import sn.niit.devspring.service.CategorieService;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/categories")
public class CategorieController {
    private final CategorieService categorieService;

    @GetMapping
    public List<Categorie> getAllCategorie(){
        return categorieService.getAllCategorie();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categorie> getCategorieById(@PathVariable("id") Long id){
        Categorie categorie = categorieService.getCategorieById(id);

        return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(categorie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categorie> updateCategorie(@PathVariable("id") Long id,
                                                     @RequestBody Categorie categorie){
        Categorie myCategorie = categorieService.updateCategorie(categorie, id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(myCategorie);
    }
    @PostMapping
    ResponseEntity<Categorie> addCategorie(@RequestBody Categorie categorie) {
        Categorie myCategorie = categorieService.addCategorie(categorie);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(categorie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategorie(@PathVariable("id") Long id){
        categorieService.deleteCategorie(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("La catégorie a été supprimée avec succès");
    }
}
