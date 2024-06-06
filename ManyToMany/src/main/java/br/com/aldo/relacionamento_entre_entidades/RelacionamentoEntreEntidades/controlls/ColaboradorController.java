package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.controlls;

import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Colaborador;
import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @GetMapping("/listar")
    public Iterable<Colaborador> listar(){
        return colaboradorRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Colaborador cadastrar(@RequestBody Colaborador colaborador){
        return colaboradorRepository.save(colaborador);
    }

}
