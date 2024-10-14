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
@ToString(exclude = "idReservation", includeFieldNames=false)
@EqualsAndHashCode(exclude = "idReservation")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "T_Reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "R_id_reservation")
    Long idReservation;

    @Column(name = "R_annee_universitaire")
    Date anneeUniversitaire;

    @Column(name = "R_est_valide")
    Boolean estValide;



    @ManyToMany(cascade = CascadeType.ALL)
    Set<Etudiant> etudiants;


}
