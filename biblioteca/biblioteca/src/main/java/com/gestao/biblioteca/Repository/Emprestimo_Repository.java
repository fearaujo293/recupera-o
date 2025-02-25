package com.gestao.biblioteca.Repository;

import com.gestao.biblioteca.Model.Emprestimo_Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Emprestimo_Repository extends JpaRepository<Emprestimo_Model , Long> {

}
