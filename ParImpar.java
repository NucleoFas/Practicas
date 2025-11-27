import java.util.Scanner;

class ParImpar {
    public static void main(String[] args) {
       int n, res;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Dime el año: ");9

       n = entrada.nextInt();
       entrada.close();

       res = n % 2;
       if (res ==0) {
           System.out.println(n + " es un número par");
       }
       else {
           System.out.println(n + " es un número impar");
       }
    }
}
