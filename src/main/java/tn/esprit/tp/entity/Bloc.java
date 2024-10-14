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
@ToString(exclude = "idBloc", includeFieldNames=false)
@EqualsAndHashCode(exclude = "idBloc")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "T_Bloc")
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "B_id_bloc")
    Long idBloc;

    @Column(name = "B_nom_bloc")
    String nomBloc;

    @Column(name = "B_capacite_bloc")
    Long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "bloc")
    Set<Chambre> chambres ;


}

