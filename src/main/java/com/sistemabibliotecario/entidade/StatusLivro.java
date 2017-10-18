/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemabibliotecario.entidade;

/**
 *
 * @author diego
 */
enum StatusLivro {
    EMPRESTADO("Emprestado"),
    RESERVADO("Reservado"),
    DISPONIVEL("Disponível"),
    INDISPONIVEL("Indisponível");

    private StatusLivro(String status) {
        this.status = status;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
