package sn.niit.devspring.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.niit.devspring.model.Produit;
import sn.niit.devspring.service.ProduitService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/produits")
public class ProduitController {
    private final ProduitService produitService;

    @GetMapping
    public List<Produit> getAllProduit(){
        return produitService.getAllProduit();
    }
}
