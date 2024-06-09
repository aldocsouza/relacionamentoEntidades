package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.controlls;

import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Comentario;
import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @GetMapping("/listar")
    public Iterable<Comentario> listar(){
        return comentarioRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Comentario cadastrar(@RequestBody Comentario comentario){
        return comentarioRepository.save(comentario);
    }

}

