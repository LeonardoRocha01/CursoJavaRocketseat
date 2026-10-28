package br.com.leonardo.api_cursos.CursoService;

import br.com.leonardo.api_cursos.CursoEntity.Curso;
import br.com.leonardo.api_cursos.CursoNotFoundException.CursoNotFoundException;
import br.com.leonardo.api_cursos.CursoRepository.CursoRepository;
import br.com.leonardo.api_cursos.CursoRequestDTO.CursoRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CursoService {

    private final CursoRepository cursoRepository;

    public Curso create(CursoRequestDTO cursoRequestDTO) {
        Curso curso = Curso.builder()
                .name(cursoRequestDTO.name())
                .category(cursoRequestDTO.category())
                .teacher(cursoRequestDTO.teacher())
                .active(true)
                .build();

        return cursoRepository.save(curso);
    }

    public List<Curso> list(String name, String category){
        if (name != null && category != null){
            return cursoRepository.findByNameContainingIgnoreCaseAndCategoryIgnoreCase(name, category);
        }
        if (name != null){
            return cursoRepository.findByNameContainingIgnoreCase(name);
        }
        if (category != null){
            return cursoRepository.findByCategoryIgnoreCase(category);
        }
        return cursoRepository.findAll();
    }

    public Curso update(UUID id,CursoRequestDTO cursoRequestDTO) {
        Curso curso = cursoRepository.findById(id).orElseThrow(() ->
                new CursoNotFoundException(id));

        if(cursoRequestDTO.name() != null) curso.setName(cursoRequestDTO.name());
        if(cursoRequestDTO.category() != null) curso.setCategory(cursoRequestDTO.category());
        if(cursoRequestDTO.teacher() != null) curso.setTeacher(cursoRequestDTO.teacher());

        return cursoRepository.save(curso);
    }
    public void delete(UUID id) {
        Curso curso = cursoRepository.findById(id).orElseThrow(() ->
                new CursoNotFoundException(id));

        cursoRepository.delete(curso);
    }

    public Curso toggleActive(UUID id) {
        Curso curso = cursoRepository.findById(id).orElseThrow(() ->
                new CursoNotFoundException(id));

        curso.setActive(!curso.getActive());
        return cursoRepository.save(curso);
    }
}
