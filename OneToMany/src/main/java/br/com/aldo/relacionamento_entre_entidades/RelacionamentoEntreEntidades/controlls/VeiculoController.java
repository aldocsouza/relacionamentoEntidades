package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.controlls;

import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Veiculo;
import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;


    @GetMapping("/listar")
    public Iterable<Veiculo> listar(){
        return veiculoRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Veiculo cadastrar(@RequestBody Veiculo veiculo){
        return veiculoRepository.save(veiculo);
    }

}
