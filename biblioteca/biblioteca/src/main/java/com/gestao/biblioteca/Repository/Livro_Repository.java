package com.gestao.biblioteca.Repository;

import com.gestao.biblioteca.Model.Livro_Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Livro_Repository extends JpaRepository<Livro_Model , Long> {
}
