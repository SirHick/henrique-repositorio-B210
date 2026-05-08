package exercicios.sistemaAluno.controller;

import exercicios.sistemaAluno.model.SistemaModel;
import exercicios.sistemaAluno.Service.SistemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/aluno")
@RequiredArgsConstructor

public class SistemaController {

    private final SistemaService service;

    //GET /pessoa (listar todas)

    @GetMapping
    public List<SistemaModel> listar(){
        return service.listar();
    }

    //GET /pessoa/ {id} (busca por id)

    @GetMapping("/{id}")
    public ResponseEntity<SistemaModel> buscar(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPorID(id));
    }

    //POST /pessoa/{id}

    @PostMapping
    public ResponseEntity<SistemaModel> inserir(@RequestBody SistemaModel aluno) {
        return ResponseEntity.ok(service.inserir(aluno));
    }
    //PUT /pessoa /{id} (Atualizar)
    @PutMapping("/{id}")
    public ResponseEntity<SistemaModel> atualizar(@PathVariable Long id,
                                            @RequestBody SistemaModel dados){
        return ResponseEntity.ok(service.atualizar(id, dados));
    }

    //DELETE /pessoas/ {id}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

}
