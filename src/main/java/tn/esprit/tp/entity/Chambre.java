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
@ToString(exclude = "idChambre", includeFieldNames=false)
@EqualsAndHashCode(exclude = "idChambre")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "T_Chambre")
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "C_id_chambre")
    Long idChambre;

    @Column(name = "C_numero_chambre")
    Long numeroChambre;

    @Enumerated(EnumType.STRING)
    @Column(name = "C_type_c")
    TypeChambre typeC;

    @ManyToOne
    Bloc bloc;

    @OneToMany (cascade = CascadeType.ALL)
    Set<Reservation> reservations ;


}
