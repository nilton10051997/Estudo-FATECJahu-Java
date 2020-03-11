package gti1semestre2020;
import java.util.Scanner;
public class Programa8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declarando as variáveis:
        String nome="?",sexo="?",estudante="?",senhoria="?";
        double idade=0,ingresso=100,desconto=0;
        // Entrada de dados:
        System.out.println("Digite o seu nome:");
        nome = teclado.next().toUpperCase();
        System.out.println("Digite a sua idade:");
        idade = teclado.nextDouble();
        System.out.println("Qual é o seu sexo? Digite 'F' para Feminino, ou 'M' para masculino.\nDigite F ou M:");
        sexo = teclado.next().toUpperCase();
        System.out.println("Você é estudante? Digite 'S' se for estudante, ou digite 'N' se não for estudante.\nDigite S ou N");
        estudante = teclado.next().toUpperCase();
        // Processamento:
        if (idade >= 50 && idade <= 70) {
            desconto = 0.4;
        }else {
            if (estudante.equals("S")) {
                desconto = 0.3;
            }else {
                if (sexo.equals("F")) {
                    desconto = 0.1;
                }
            }
        }
        if (sexo.equals("F")) {
            senhoria="Senhora";
        }else {
            if (sexo.equals("M")) {
                senhoria="Senhor";
            }else {
                senhoria="?";
            }
        }
        if (estudante.equals("S")) {
            estudante="SIM";
        }else {
            if (estudante.equals("N")) {
                estudante="NÃO";
            }else {
                estudante="?";
            }
        }
        if (sexo.equals("F")) {
            sexo="FEMININO";
        }else {
            if (sexo.equals("M")) {
                sexo="MASCULINO";
            }else {
                sexo="?";
            }
        }
        // Saída de dados:
        ingresso = ingresso-(ingresso*desconto);
        System.out.printf("\n%s %s, os seus dados estão logo abaixo.\nIdade: %.0f\nEstudante: %s\nSexo: %s\nValor do ingresso: %.2f\nPorcentagem de desconto: %.2f\n",senhoria,nome,idade,estudante,sexo,ingresso,desconto);
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

//obs: não pode acumular desconto, nesse caso escolhe-se o maior desconto