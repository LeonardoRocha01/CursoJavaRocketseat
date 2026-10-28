package br.com.leonardo.api_cursos.CursoController;

import br.com.leonardo.api_cursos.CursoEntity.Curso;
import br.com.leonardo.api_cursos.CursoRequestDTO.CursoRequestDTO;
import br.com.leonardo.api_cursos.CursoService.CursoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cursos")
@RequiredArgsConstructor
public class CursoController {

    private final CursoService cursoService;

    @PostMapping
    public Curso create(@RequestBody @Valid CursoRequestDTO cursoRequestDTO) {
        return cursoService.create(cursoRequestDTO);
    }
    @GetMapping
    public List<Curso> list(@RequestParam(required = false) String name, @RequestParam(required = false) String category) {
        return cursoService.list(name, category);
    }
    @PutMapping("/{id}")
        public Curso update(@PathVariable UUID id, @RequestBody CursoRequestDTO cursoRequestDTO) {
        return cursoService.update(id, cursoRequestDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        cursoService.delete(id);
    }
    @PatchMapping("/{id}/active")
    public Curso toggleActive(@PathVariable UUID id) {
        return cursoService.toggleActive(id);
    }
}
