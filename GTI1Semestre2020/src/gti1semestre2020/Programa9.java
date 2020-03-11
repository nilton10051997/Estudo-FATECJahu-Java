package gti1semestre2020;
import java.util.Scanner;
public class Programa9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("Digite o número:");
        n = ler.nextInt();
        
        // Looping com FOR:
        System.out.println("\nLooping com FOR:");
        for (int x=1;x<=10;x++) {
            System.out.printf("%d X %d - %d\n",n,x,(n*x));
        }
        
        // Looping com WHILE:
        System.out.println("\nLooping com WHILE:");
        int x = 1;
        while(x<=10) {
            System.out.printf("%d X %d - %d\n",n,x,(n*x));
            x++;
        }
        
        // Looping com DO:
        System.out.println("\nLooping com DO:");
        x = 1;
        do {
            System.out.printf("%d X %d - %d\n",n,x,(n*x));
            x++;
        }while(x<=10);
    }
}
