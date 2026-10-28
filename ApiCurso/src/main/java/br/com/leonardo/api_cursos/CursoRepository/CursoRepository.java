package br.com.leonardo.api_cursos.CursoRepository;

import br.com.leonardo.api_cursos.CursoEntity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CursoRepository extends JpaRepository<Curso, UUID> {

    List<Curso> findByNameContainingIgnoreCase(String name);
    List<Curso> findByCategoryIgnoreCase(String category);
    List<Curso> findByNameContainingIgnoreCaseAndCategoryIgnoreCase(String name, String category);
}
