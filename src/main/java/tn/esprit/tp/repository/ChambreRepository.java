package tn.esprit.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp.entity.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
