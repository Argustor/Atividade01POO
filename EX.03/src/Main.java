import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int resultado = Soma.somar(numero);
        System.out.println("A soma de 0 até " + numero + " é: " + resultado);
        sc.close();
    }
}