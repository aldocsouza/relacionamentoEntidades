package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.controlls;

import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Marca;
import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Veiculo;
import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @GetMapping("/listar")
    public Iterable<Marca> listar(){
        return marcaRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Marca cadastrar(@RequestBody Marca marca){
        return marcaRepository.save(marca);
    }

}
