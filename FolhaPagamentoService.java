package br.com.desafio.service;

import br.com.desafio.model.Funcionario;
import java.util.List;

public class FolhaPagamentoService {
    
    public void processarFolha(List<Funcionario> funcionarios) {
        System.out.println("=== PROCESSANDO FOLHA DE PAGAMENTO ===");
        System.out.println("Data: " + java.time.LocalDate.now());
        System.out.println("----------------------------------------");
        
        double totalFolha = 0;
        
        for (Funcionario func : funcionarios) {
            double salario = func.calcularSalario();
            double bonus = func.calcularBonus();
            
            System.out.println(func.toString());
            System.out.printf("  -> Salário calculado: R$ %.2f (Bônus: R$ %.2f)%n%n", 
                            salario, bonus);
            
            totalFolha += salario;
        }
        
        System.out.println("----------------------------------------");
        System.out.printf("TOTAL DA FOLHA: R$ %.2f%n", totalFolha);
        System.out.println("========================================");
    }
    
    public void processarFolha(Funcionario funcionario) {
        processarFolha(List.of(funcionario));
    }
}
