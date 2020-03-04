package gti1semestre2020;
import java.util.Scanner;
public class Programa7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaração da variável:
        double p1=0,p2=0,media=0;
        String situacao="";
        // Entrada de dados:
        System.out.println("Digite a nota da sua P1:");
        p1 = teclado.nextDouble();
        System.out.println("Agora digite a nota da sua P2:");
        p2 = teclado.nextDouble();
        media = (p1+p2)/2;
        if (media <= 3) {
            situacao = "Reprovado";
        }else {
            if (media > 3 && media < 6) {
                situacao = "Exame";
            }else {
                if (media >= 6) {
                    situacao = "Aprovado";
                }
            }
        }
        System.out.printf("A nota da sua prova 1 foi: %.2f\nA nota da sua prova 2 foi: %.2f\n\nSua média foi: %.2f\nSua situação é: %s\n",p1,p2,media,situacao);

// OU

//        System.out.println("Digite a nota da sua P1:");
//        double p1 = teclado.nextDouble();
//        System.out.println("Agora digite a nota da sua P2:");
//        double p2 = teclado.nextDouble();
//        double media = (p1+p2)/2;
//        if (media <= 3) {
//            System.out.print("A nota da sua prova 1 foi: "+p1);
//            System.out.println("A nota da sua prova 2 foi: "+p2);
//            System.out.println("Sua média foi: "+media);
//            System.out.println("Sua situação é: Reprovado\n");
//        }else {
//            if (media > 3 && media < 6) {
//                System.out.print("A nota da sua prova 1 foi: "+p1);
//                System.out.println("A nota da sua prova 2 foi: "+p2);
//                System.out.println("Sua média foi: "+media);
//                System.out.println("Sua situação é: Exame\n");
//            }else {
//                if (media >= 6) {
//                    System.out.print("A nota da sua prova 1 foi: "+p1);
//                    System.out.println("A nota da sua prova 2 foi: "+p2);
//                    System.out.println("Sua média foi: "+media);
//                    System.out.println("Sua situação é: Aprovado\n");
//                }
//            }
//        }
    }
}