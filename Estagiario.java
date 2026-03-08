package br.com.desafio.model;

import java.time.LocalDate;

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;
    private int horasTrabalhadas;
    private double valorHora;
    
    public Estagiario(String nome, String cpf, LocalDate dataNascimento,
                      String endereco, String instituicaoEnsino,
                      double valorHora) {
        super(nome, cpf, dataNascimento, endereco, 0);
        this.instituicaoEnsino = instituicaoEnsino;
        this.valorHora = valorHora;
        this.horasTrabalhadas = 0;
    }
    
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora + calcularBonus();
    }
    
    @Override
    public double calcularBonus() {
        return 150.00;
    }
    
    public void registrarHorasTrabalhadas(int horas) {
        this.horasTrabalhadas += horas;
    }
    
    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }
    
    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    
    public double getValorHora() {
        return valorHora;
    }
    
    @Override
    public String toString() {
        return String.format("%s | Cargo: Estagiário | Instituição: %s | Horas: %d | Salário: R$ %.2f",
                super.toString(), instituicaoEnsino, horasTrabalhadas, calcularSalario());
    }
}
