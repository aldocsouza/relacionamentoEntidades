package br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.controlls;

import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.models.Postagem;
import br.com.aldo.relacionamento_entre_entidades.RelacionamentoEntreEntidades.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postagens")
public class PostagemController {

    @Autowired
    private PostagemRepository postagemRepository;

    @GetMapping("/listar")
    public Iterable<Postagem> listar(){
        return postagemRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem postagem){
        return postagemRepository.save(postagem);
    }

}
