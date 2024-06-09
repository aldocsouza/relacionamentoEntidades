package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.repository;

import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
}
