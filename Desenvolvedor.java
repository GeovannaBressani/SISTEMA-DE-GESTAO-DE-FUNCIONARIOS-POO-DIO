package br.com.desafio.model;

import java.time.LocalDate;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;
    private int horasExtras;
    private double valorHoraExtra;
    
    public Desenvolvedor(String nome, String cpf, LocalDate dataNascimento,
                         String endereco, double salarioBase,
                         String linguagemPrincipal, double valorHoraExtra) {
        super(nome, cpf, dataNascimento, endereco, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
        this.valorHoraExtra = valorHoraExtra;
        this.horasExtras = 0;
    }
    
    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus() + (horasExtras * valorHoraExtra);
    }
    
    @Override
    public double calcularBonus() {
        if (calcularIdade() > 25) {
            return salarioBase * 0.10;
        }
        return 0;
    }
    
    public void registrarHoraExtra(int horas) {
        this.horasExtras += horas;
    }
    
    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }
    
    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }
    
    public int getHorasExtras() {
        return horasExtras;
    }
    
    public double getValorHoraExtra() {
        return valorHoraExtra;
    }
    
    @Override
    public String toString() {
        return String.format("%s | Cargo: Desenvolvedor | Linguagem: %s | Horas Extras: %d | Salário Final: R$ %.2f",
                super.toString(), linguagemPrincipal, horasExtras, calcularSalario());
    }
}
