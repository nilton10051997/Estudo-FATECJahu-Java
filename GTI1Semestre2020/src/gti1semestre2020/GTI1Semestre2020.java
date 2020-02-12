package gti1semestre2020;
public class GTI1Semestre2020
{
    public static void main (String[] args) {
        int a= 1, b =2, c;
        System.out.println("Exemplo1: "+"Ola seja bem vindo!"+a);
        c = a + b;
        System.out.println("Exemplo2: "+"Valor a = "+a+" Valor de b = "+b);
        System.out.println("Exemplo3: "+"Valor a = "+a+"\nValor de b = "+b+"\nValor de c = "+c);
        double x = 1.56, y = 3.45;
        float w = 2.345f;
        System.out.println("Exemplo4: "+"x = "+x+", y = "+y+", x+y = "+(x+y));
        double z = 1.5667, k = 3.4556;
        System.out.println("Exemplo5: "+"z = "+z+", k = "+k+", z+k = "+(z+k));
        System.out.printf("Exemplo6: z = %.2f, k = %.2f, x+y = %.2f\n",z,k,(x+y));
        String nome = "Wdson", sobre_nome = "Oliveira";
        System.out.println("Exemplo7: "+nome+" "+sobre_nome);
        System.out.println("Exemplo8: "+nome.toUpperCase()+" "+sobre_nome.toLowerCase());
    }
}