package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "postagens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String titulo;
    private String texto;

    @OneToMany
    @JoinColumn(name = "codigo_postagem")
    List<Comentario> comentarios;

}
