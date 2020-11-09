package br.com.projetofuncionario.dominio;

import java.util.ArrayList;
import java.util.List;

public class Gerenciadora {

    private List<Funcionario> listaFuncionarios = new ArrayList();


    public void add(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);

    }

    public Funcionario buscaPorMatricula(String matricula) throws IllegalArgumentException {

        return listaFuncionarios
                .stream()
                .filter(funcionario -> funcionario.getMatricula().equals(matricula))
                .findFirst()
                // .orElse(new Funcionario("Funcionario Padrão", 0, "", 0));
                // .orElse(null);
                .orElseThrow(() -> new IllegalArgumentException("Funcionario não encontrado pela matricula " + matricula));
    }

    public Funcionario buscaPorMatriculaMetodoNativo(String matricula) {

        for (int i = 0; i < listaFuncionarios.size(); i++) {

            if (listaFuncionarios.get(i).getMatricula().equals(matricula)) {
                return listaFuncionarios.get(i);
            }


        }
        throw  new IllegalArgumentException("Funcionario não encontrado pela matricula " + matricula);
    }

}
