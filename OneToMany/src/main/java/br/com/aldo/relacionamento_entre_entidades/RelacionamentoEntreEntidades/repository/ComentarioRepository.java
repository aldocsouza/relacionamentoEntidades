package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.repository;

import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
