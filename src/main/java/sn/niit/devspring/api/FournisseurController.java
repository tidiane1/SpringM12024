package sn.niit.devspring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.niit.devspring.model.Fournisseur;
import sn.niit.devspring.service.FournisseurService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fournisseurs")
public class FournisseurController {
    @Autowired
    FournisseurService fournisseurService;

    @GetMapping
    public List<Fournisseur> getAllFournisseur(){
        return fournisseurService.getAllFournisseur();
    }
}