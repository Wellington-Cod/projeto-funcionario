package br.com.projetofuncionario.main;

import br.com.projetofuncionario.dominio.Funcionario;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class TesteFuncionario {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String fileName = "arquivoFuncionario.bin";

        List<Funcionario> listafuncionarios = new ArrayList<Funcionario>();

        listafuncionarios.add(new Funcionario("Wellington", 35, "123456-5", 1800.00));
        listafuncionarios.add(new Funcionario("Girdacio", 28, "78963-8", 1800.00));
        listafuncionarios.add(new Funcionario("Leandro", 30, "98745-0", 1800.00));
        listafuncionarios.add(new Funcionario("Fellipe", 31, "88788-1", 1800.00));
        listafuncionarios.add(new Funcionario("Bruno", 32, "58977-2", 1800.00));



        ObjectOutputStream gerarArquivoFuncionario = new ObjectOutputStream(new FileOutputStream(fileName));
        gerarArquivoFuncionario.writeObject(listafuncionarios);
        gerarArquivoFuncionario.close();

        ObjectInputStream conversaoArquivoFuncionario = new ObjectInputStream(new FileInputStream(fileName));
        List<Funcionario> funcionarioList = (List<Funcionario>) conversaoArquivoFuncionario.readObject();
        conversaoArquivoFuncionario.close();

        Collections.sort(listafuncionarios);
//
//
        listafuncionarios.forEach(funcionario -> {
            System.out.println("" + funcionario);
        });

    }
}