package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.repository;

import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
