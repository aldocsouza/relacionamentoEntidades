package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_veiculos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String placa;
    private String modelo;

    @OneToOne
    @JoinColumn(name = "codigo_marca", referencedColumnName = "codigo")
    private Marca marca;

}
