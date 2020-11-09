package br.com.projetofuncionario.main;

import br.com.projetofuncionario.dominio.Funcionario;
import br.com.projetofuncionario.dominio.Gerenciadora;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class BuscaMatricula {

    public static void main(String[] args) {
        Gerenciadora gerenciadora = new Gerenciadora();


        gerenciadora.add(new Funcionario("Wellington", 35, "123456-5", 2500.00));
        gerenciadora.add(new Funcionario("Girdacio", 28, "78963-8", 2500.00));
        gerenciadora.add(new Funcionario("Leandro", 30, "98745-0", 2500.00));
        gerenciadora.add(new Funcionario("Fellipe", 31, "88788-1", 2500.00));
        gerenciadora.add(new Funcionario("Bruno", 32, "58977-2", 2500.00));


       // Funcionario funcionario = gerenciadora.buscaPorMatricula("88788");
        Funcionario funcionarioNativo = gerenciadora.buscaPorMatriculaMetodoNativo("58977-2");
       // System.out.println(funcionario);
        System.out.println(funcionarioNativo);


//        listafuncionarios.forEach(funcionario -> {
//            System.out.println("" + funcionario);
//        });

    }
}