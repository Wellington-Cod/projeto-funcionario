package br.com.projetofuncionario.dominio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gerenciadora {

    private List<Funcionario> listaFuncionarios = new ArrayList();


    public void add (Funcionario funcionario) {
        listaFuncionarios.add(funcionario);

    }

    public Funcionario buscaPorMatricula(String matricula) throws IllegalArgumentException {

        return listaFuncionarios
                .stream()
                .filter(funcionario -> matricula.equals(funcionario.getMatricula().getMatricula()))
                .findFirst()
               // .orElse(new Funcionario("Funcionario Padrão", 0, "", 0));
               // .orElse(null);
                .orElseThrow(()->new IllegalArgumentException("Funcionario não encontrado pela matricula " + matricula));
    }
}
