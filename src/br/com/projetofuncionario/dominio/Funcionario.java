package br.com.projetofuncionario.dominio;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable, Comparable <Funcionario> {

    private double salario;
    private  Matricula matricula;

    public Funcionario( String  nome, int idade, String matricula, double salario) {
        this.setNome(nome);
        this.idade = idade;
        this.matricula = new Matricula(matricula);
        this.salario = salario;
    }

    public Funcionario() {
    }





    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public int compareTo(Funcionario outro) {
        return (this.idade - outro.idade);
    }
}