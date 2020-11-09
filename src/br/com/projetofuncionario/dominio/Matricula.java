package br.com.projetofuncionario.dominio;

import java.io.Serializable;
import java.util.Objects;

public class Matricula implements Serializable {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public Matricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Compara String matricula com valor desta matricula
     * @param matricula buscada
     * @return <b>true</b> se a matricula foi encontrada <b>false</b> caso contrario
     */
    public boolean equals(String matricula) {
        return matricula.equals(this.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return matricula;
    }
}
