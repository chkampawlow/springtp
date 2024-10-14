package tn.esprit.tp.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "idEtudiant", includeFieldNames=false)
//@EqualsAndHashCode(exclude = "idEtudiant")
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "T_Etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @EqualsAndHashCode.Exclude
    @Column(name = "E_id_etudiant")
    Long idEtudiant;

    @Column(name = "E_nom_et")

    protected String nomEt;

    @Column(name = "E_prenom_et")
    String prenomEt;

    @Column(name = "E_cin")
    Long cin;

    @Column(name = "E_ecole")
    String ecole;

    @Column(name = "E_date_naissance")
     Date dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "etudiants")
    Set<Reservation> reservations;


}

