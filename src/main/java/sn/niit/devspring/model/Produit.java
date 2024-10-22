package sn.niit.devspring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Produit extends BaseEntity{
    private String nom;
    private String description;
    private double prixUnitaire;
    private String marque;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateFabrication;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate datePeremption;

    @JsonBackReference
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categorie_id", nullable = false)
    private Categorie categorie;
    @ManyToMany(mappedBy = "produits", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Fournisseur> fournisseurs;
}
