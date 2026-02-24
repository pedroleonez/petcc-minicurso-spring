package petcc.gabaritoProjetoPrimeiroDia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import petcc.gabaritoProjetoPrimeiroDia.model.Petiano;

@Repository
public interface PetianoRepository extends JpaRepository<Petiano, Long> {
   
}

