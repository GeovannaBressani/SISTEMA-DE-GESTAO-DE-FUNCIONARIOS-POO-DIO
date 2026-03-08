package br.com.desafio.model;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    private int numeroProjetos;
    private double bonusPorProjeto;
    
    public Gerente(String nome, String cpf, LocalDate dataNascimento, 
                   String endereco, double salarioBase, 
                   int numeroProjetos, double bonusPorProjeto) {
        super(nome, cpf, dataNascimento, endereco, salarioBase);
        this.numeroProjetos = numeroProjetos;
        this.bonusPorProjeto = bonusPorProjeto;
    }
    
    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus();
    }
    
    @Override
    public double calcularBonus() {
        return numeroProjetos * bonusPorProjeto;
    }
    
    public int getNumeroProjetos() {
        return numeroProjetos;
    }
    
    public void setNumeroProjetos(int numeroProjetos) {
        this.numeroProjetos = numeroProjetos;
    }
    
    public double getBonusPorProjeto() {
        return bonusPorProjeto;
    }
    
    public void setBonusPorProjeto(double bonusPorProjeto) {
        this.bonusPorProjeto = bonusPorProjeto;
    }
    
    @Override
    public String toString() {
        return String.format("%s | Cargo: Gerente | Projetos: %d | Salário Final: R$ %.2f",
                super.toString(), numeroProjetos, calcularSalario());
    }
}
