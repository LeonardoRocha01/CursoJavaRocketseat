package br.com.leonardo.api_cursos.CursoRequestDTO;

import jakarta.validation.constraints.NotBlank;

public record CursoRequestDTO(@NotBlank String name, @NotBlank String category, @NotBlank String teacher) {
}
