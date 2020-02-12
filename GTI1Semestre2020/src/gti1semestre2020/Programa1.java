package gti1semestre2020;
import java.util.Scanner;
public class Programa1
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nx=4.75,ny=5.98;
        System.out.printf("Exemplo1: Média = %.2f\n",(nx+ny)/2);
        System.out.printf("Exemplo2: NX = %.2f, NY = %.2f, Média NX e NY = %.2f\n",nx,ny,(nx+ny)/2);
        double n1,n2;
        System.out.println("Exemplo3: Digite a nota 1:");
        n1 = teclado.nextDouble();
        System.out.println("Nota 1 = "+n1+". Agora digite a nota 2:");
        n2 = teclado.nextDouble();
        System.out.printf("N1 = %.2f, N2 = %.2f, Média = %.2f\n",n1,n2,((n1+n2)/2));
    }
}