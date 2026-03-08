package br.com.desafio;

import br.com.desafio.model.*;
import br.com.desafio.service.FolhaPagamentoService;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTÃO DE FUNCIONÁRIOS ===\n");
        
        Gerente gerente = new Gerente(
            "João Silva", 
            "123.456.789-00", 
            LocalDate.of(1980, 5, 15),
            "Rua A, 123", 
            8000.00, 
            3,
            500.00
        );
        
        Desenvolvedor dev = new Desenvolvedor(
            "Maria Santos", 
            "987.654.321-00", 
            LocalDate.of(1995, 3, 22),
            "Rua B, 456", 
            5000.00, 
            "Java", 
            50.00
        );
        
        Estagiario estagiario = new Estagiario(
            "Pedro Oliveira", 
            "111.222.333-44", 
            LocalDate.of(2002, 11, 10),
            "Rua C, 789", 
            "Universidade XYZ", 
            20.00
        );
        
        dev.registrarHoraExtra(10);
        estagiario.registrarHorasTrabalhadas(160);
        
        System.out.println("--- DADOS DOS FUNCIONÁRIOS ---");
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Desenvolvedor: " + dev.getNome() + " - Linguagem: " + dev.getLinguagemPrincipal());
        System.out.println("Estagiário: " + estagiario.getNome() + " - Instituição: " + estagiario.getInstituicaoEnsino());
        System.out.println();
        
        FolhaPagamentoService folhaService = new FolhaPagamentoService();
        List<Funcionario> funcionarios = List.of(gerente, dev, estagiario);
        folhaService.processarFolha(funcionarios);
        
        System.out.println("\n--- ATUALIZANDO DADOS ---");
        gerente.setNumeroProjetos(5);
        System.out.println("Gerente agora gerencia " + gerente.getNumeroProjetos() + " projetos");
        
        folhaService.processarFolha(gerente);
    }
}
