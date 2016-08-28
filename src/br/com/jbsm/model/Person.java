package br.com.jbsm.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.Id;

public class Person {
    @Id
    @NotNull
    private Integer id;

    @NotNull
    private String nome;

    @NotNull
    private String cpf;

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
