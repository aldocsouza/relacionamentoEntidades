package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.controlls;

import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Cargo;
import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoRepository cargoRepository;

    @GetMapping("/listar")
    public Iterable<Cargo> list(){
        return cargoRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Cargo create(@RequestBody Cargo cargo){
        return cargoRepository.save(cargo);
    }

}
