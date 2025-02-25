package com.gestao.biblioteca.Repository;

import com.gestao.biblioteca.Model.Usuario_Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Usuario_Repository extends JpaRepository<Usuario_Model , Long> {

}
