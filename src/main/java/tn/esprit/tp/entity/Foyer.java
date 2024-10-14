package tn.esprit.tp.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "idFoyer", includeFieldNames=false)
@EqualsAndHashCode(exclude = "idFoyer")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "T_Foyer")
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "F_id_foyer")
    Long idFoyer;

    @Column(name = "F_nom_foyer")
    String nomFoyer;

    @Column(name = "F_capacite_foyer")
    Long capaciteFoyer;

    @OneToOne (mappedBy = "foyer")
    Universite universite;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "foyer")
    Set<Bloc> blocs ;



}
