package tn.esprit.tp.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "idUniversite", includeFieldNames=false)
@EqualsAndHashCode(exclude = "idUniversite")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "T_Universite")

public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "U_id_universite")
    Long idUniversite;

    @Column(name = "U_nom_universite")
    String nomUniversite;

    @Column(name = "U_adresse")
    String adresse;

    @OneToOne
    Foyer foyer;

}
