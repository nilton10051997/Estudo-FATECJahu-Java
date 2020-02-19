package gti1semestre2020;
import java.util.Scanner;
public class Programa4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double precoFabrica = teclado.nextDouble();
        System.out.println("Digite o lucro do distribuidor: ");
        double lucroDistribuidor = teclado.nextDouble() * 0.01;
        // OU
            // double lucroDistribuidor = teclado.nextDouble();
            // double valorLucroDistribuidor = lucroDistribuidor*0.01;
        System.out.println("Digite o valor dos impostos: ");
        double impostos = teclado.nextDouble();
        double valorImpostos = impostos*0.01;
        double valorFinal = (precoFabrica+(precoFabrica*lucroDistribuidor)+(precoFabrica*valorImpostos));
        System.out.println("Preço de fábrica: " + precoFabrica);
        System.out.println("Lucro do distribuidor: " + lucroDistribuidor);
        System.out.println("Valor dos impostos: " + impostos);
        System.out.println("Preço final: " + valorFinal);
        // OU
            // System.out.printf("Preço de fábrica: %.2f\nLucro do distribuidor: %.2f\nValor dos impostos: %.2f\nPreço final: %.2f",precoFabrica,lucroDistribuidor,impostos,valorFinal);
    }
}
