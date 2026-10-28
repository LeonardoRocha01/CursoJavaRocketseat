package br.com.leonardo.api_cursos.CursoNotFoundException;

import java.util.UUID;

public class CursoNotFoundException extends RuntimeException {
    public CursoNotFoundException(UUID id) {
        super("Curso não encontrado com id: " + id);
    }
}
