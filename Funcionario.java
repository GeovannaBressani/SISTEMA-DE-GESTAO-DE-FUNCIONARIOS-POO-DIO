package br.com.desafio.model;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String endereco;
    protected double salarioBase;
    
    public Funcionario(String nome, String cpf, LocalDate dataNascimento, 
                      String endereco, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.salarioBase = salarioBase;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public int calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    public abstract double calcularSalario();
    
    public abstract double calcularBonus();
    
    @Override
    public String toString() {
        return String.format("Nome: %s | CPF: %s | Idade: %d", 
                nome, cpf, calcularIdade());
    }
}
