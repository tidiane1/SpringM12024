package sn.niit.devspring.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Fournisseur extends BaseEntity{
private String nom;
private String prenom;
    @JsonBackReference
    @ManyToMany
    @JoinTable(name = "fournisseur_produit", joinColumns = @JoinColumn(name = "fournisseur_id"), inverseJoinColumns = @JoinColumn(name = "produit_id"))
    List<Produit> produits;

    public Fournisseur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }
}
