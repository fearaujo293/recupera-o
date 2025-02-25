package com.gestao.biblioteca.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_emprestimo")
public class Emprestimo_Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario_Model usuario;

    @OneToOne
    @JoinColumn(name = "livro_id", unique = true)
    private Livro_Model livro;

    public Emprestimo_Model() {}

    public Emprestimo_Model(Long id, LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista, Usuario_Model usuario, Livro_Model livro) {
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.usuario = usuario;
        this.livro = livro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public Usuario_Model getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario_Model usuario) {
        this.usuario = usuario;
    }

    public Livro_Model getLivro() {
        return livro;
    }

    public void setLivro(Livro_Model livro) {
        this.livro = livro;
    }


}
