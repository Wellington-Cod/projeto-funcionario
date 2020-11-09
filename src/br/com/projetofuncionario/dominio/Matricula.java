package br.com.projetofuncionario.dominio;

import java.io.Serializable;

public class Matricula implements Serializable {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public Matricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return matricula;
    }
}
