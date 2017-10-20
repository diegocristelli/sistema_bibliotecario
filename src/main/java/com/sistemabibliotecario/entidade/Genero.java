
package com.sistemabibliotecario.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Genero {
    @Id
    @GeneratedValue
    private long id;

    public Genero(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Genero() {
    }
    
    
    @Column
    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}
