package gti1semestre2020;
import java.util.Scanner;
public class Programa8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declarando as variáveis:
        String nome="",sexo="",estudante="";
        double idade=0,ingresso=100,promocaoIdade=0,promocaoSexo=0,promocaoEstudante=0;
        // Entrada de dados:
        System.out.println("Digite o seu nome:");
        nome = teclado.next();
        System.out.println("Digite a sua idade:");
        idade = teclado.nextDouble();
        System.out.println("Qual é o seu sexo?\nMasculino = M\nFeminino = F\nDigite S ou M:");
        sexo = teclado.next().toUpperCase();
        System.out.println("Você é estudante?\nSe for estudante digite 'S'\nSe não for estudante digite 'N'\nDigite S ou N");
        estudante = teclado.next().toUpperCase();
        if (idade >= 50 && idade <= 70) {
            promocaoIdade = 0.4;
            ingresso = ingresso*promocaoIdade;
        }
        if (sexo.equals(F)) {
            promocaoSexo = 0.1;
        }
    }
}

//nome
//idade
//sexo
//estudante


//valor do ingresso: R$ 100,00
//estudante tem 30% de desconto
//idade entre 50 e 70 tem 40% de desconto
//mulheres tem 10% de desconto
//não pode acumular desconto, nesse caso escolhe-se o maior desconto


// if (sexo.equals("S")) {
//}