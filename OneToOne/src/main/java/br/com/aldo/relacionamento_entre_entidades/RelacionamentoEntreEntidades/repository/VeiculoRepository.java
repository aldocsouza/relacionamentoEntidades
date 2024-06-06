package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.repository;

import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
