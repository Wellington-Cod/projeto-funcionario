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

        List<Funcionario> listafuncionarios = new ArrayList<>();
        Locale.setDefault(Locale.US);
        listafuncionarios.add(new Funcionario("Wellington", 35, "123456-0", 2500.00));
        listafuncionarios.add(new Funcionario("Wellington", 35, "123456-0", 2500.00));
        listafuncionarios.add(new Funcionario("Wellington", 35, "123456-0", 2500.00));
        listafuncionarios.add(new Funcionario("Wellington", 35, "123456-0", 2500.00));
        listafuncionarios.add(new Funcionario("Wellington", 35, "123456-0", 2500.00));
        listafuncionarios.add(new Funcionario("Wellington", 35, "123456-0", 2500.00));
        listafuncionarios.add(new Funcionario("Wellington", 35, "123456-0", 2500.00));

        ObjectOutputStream gerarArquivoFuncionario = new ObjectOutputStream(new FileOutputStream(fileName));
        gerarArquivoFuncionario.writeObject(listafuncionarios);
        gerarArquivoFuncionario.close();

        ObjectInputStream conversaoArquivoFuncionario = new ObjectInputStream(new FileInputStream(fileName));
        List<Funcionario> funcionarioList = (List<Funcionario>) conversaoArquivoFuncionario.readObject();
        conversaoArquivoFuncionario.close();

        Collections.sort(funcionarioList);


        funcionarioList.forEach(funcionario -> {
            System.out.println("" + funcionario);
        });

    }
}