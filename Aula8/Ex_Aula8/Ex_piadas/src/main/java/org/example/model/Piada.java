package org.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Piada {
    @Id
    private String id;
    private String Piada;
    private Tipo tipo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getPiada() {
        return Piada;
    }

    public void setPiada(String piada) {
        Piada = piada;
    }
}
