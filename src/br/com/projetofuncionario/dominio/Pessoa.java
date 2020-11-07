package br.com.projetofuncionario.dominio;

import java.io.Serializable;

public class Pessoa implements Serializable {

   private String nome;
   protected int idade; //TODO fazer a conversão para Date.
   private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
