package sn.niit.devspring.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Personne extends BaseEntity{
    private String prenom;
    private String nom;
    //private Adresse adresse;

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }
}
