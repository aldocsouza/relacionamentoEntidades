package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.repository;

import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
