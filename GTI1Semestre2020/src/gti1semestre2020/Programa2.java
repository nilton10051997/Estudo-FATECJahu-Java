package gti1semestre2020;
import java.util.Scanner;
public class Programa2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Entrada de dados:
        System.out.println("Digite o valor do produto: ");
        double produto = teclado.nextDouble();
        double desconto = 0.1;
        double valorDesconto = produto*desconto;
        double valorFinal = produto-valorDesconto;
        System.out.println("Preço: " + produto);
        System.out.println("Desconto: " + valorDesconto);
        System.out.println("Valor final: " + valorFinal);
        
        // OU
        
        // System.out.printf("Exemplo2:\nPreço: %.2f\nDesconto: %.2f%\n Valor final: %.2f",produto,desconto,vfinal);
    }
}
