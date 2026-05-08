package exercicios.sistemaAluno.Service;

import exercicios.sistemaAluno.model.SistemaModel;
import exercicios.sistemaAluno.repository.SistemaRepository;

import java.util.List;

public class SistemaService {
    private final SistemaRepository repository;

    public SistemaService(SistemaRepository repository) {
        this.repository = repository;
    }

    //read
    public List<SistemaModel> listar(){
        return repository.findAll();
    }

    //read buscar por ID

    public SistemaModel buscarPorID(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Aluno(a) não encontrado(a)"));
    }

    //create
    public SistemaModel inserir(SistemaModel aluno){
        return repository.save(aluno);
    }

    //update

    public SistemaModel atualizar(Long id, SistemaModel dados){
        SistemaModel aluno = buscarPorID(id);
        aluno.setNome(dados.getNome());
        aluno.setCurso(dados.getCurso());
        aluno.setMatricula(dados.getMatricula());
        return repository.save(aluno);
    }

    //delete

    public void remover(Long id){
        repository.deleteById(id);
    }

}
