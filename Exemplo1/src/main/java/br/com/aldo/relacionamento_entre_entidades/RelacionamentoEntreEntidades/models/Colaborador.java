package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "colaboradores")
@Getter
@Setter
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;

    @OneToOne
    @JoinColumn(name = "codigo_cargo", referencedColumnName = "codigo")
    private Cargo cargo;


}
