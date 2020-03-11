package gti1semestre2020;
import java.util.Scanner;
public class Programa3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        // Entrada de dados:
        System.out.println("Digite seu nome");
        String nome = teclado.next();
        System.out.println("Digite seu salário fixo");
        double sfixo = teclado.nextDouble();
        System.out.println("Digite o valor das suas vendas");
        double vendasTotal = teclado.nextDouble();
        // Processamento
        double porcComissao = 0.15;
        double comissao = vendasTotal*porcComissao;
        // Saída de dados
        System.out.println("Seu nome é: "+nome.toUpperCase());
        System.out.println("Seu salário fixo é: R$"+sfixo);
        System.out.println("Sua comissão é: R$"+comissao);
        System.out.println("Seu salário total é: R$"+(sfixo+comissao));
        
        // OU
        
        // System.out.printf("Seu nome é: %s\nSeu salário fixo é: R$%.2f\nSua comissão é: R$%.2f\nSeu salário total é: %.2f",nome.toUpperCase(),sfixo,comissao,sfixo+comissao);
    }
}
