package com.gestao.biblioteca.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Usuario_Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;


    @OneToMany(mappedBy = "usuario")
    private List<Emprestimo_Model> emprestimos;

    public Usuario_Model() {}

    public Usuario_Model(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Emprestimo_Model> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo_Model> emprestimos) {
        this.emprestimos = emprestimos;
    }



}

