package com.gestao.biblioteca.DTO;

import java.time.LocalDate;

public record Livro_DTO(Long id, LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista, String usuarioNome, String livroTitulo) {

}
