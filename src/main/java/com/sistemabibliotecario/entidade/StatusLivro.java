
package com.sistemabibliotecario.entidade;


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
        return super.toString();
    }
}
