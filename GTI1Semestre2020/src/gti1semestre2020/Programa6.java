package gti1semestre2020;
import java.util.Scanner;
public class Programa6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaração da variável:
        double salario,p=0;
        // Entrada de dados:
        System.out.println("Digite o seu salário:");
        salario = teclado.nextDouble();
        if (salario <= 900) {
            p = 0.25;
        }else {
            if (salario > 900 && salario < 2500) {
                p = 0.15;
            }else {
                if (salario >= 2500) {
                    p = 0.10;
                }
            }
        }
        System.out.printf("Seu salário corrigido ficará: %.2f\nA porcentagem usada é de: %.2f\nO valor adicional é de: %.2f\n",(salario+(salario*p)),p,(salario*p));

// OU

//        System.out.println("Digite o seu salário:");
//        salario = teclado.nextDouble();
//        System.out.println("Seu salário é:"+salario+"\n");
//        if (salario <= 900) {
//            salario = salario+(salario*0.25);
//            System.out.println("1 Seu salário corrigido ficará: "+salario\n);
//        }else {
//            if (salario > 900 && salario < 2500) {
//                salario = salario+(salario*0.1);
//                System.out.println("2 Seu salário corrigido ficará: "+salario\n);
//            }else {
//                if (salario >= 2500) {
//                    salario = salario+(salario*0.1);
//                    System.out.println("3 Seu salário corrigido ficará: "+salario\n);
//                }
//            }
//        }
    }
}