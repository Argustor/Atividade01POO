import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.printf("Digite o nome do funcionário: ");
        funcionario.nome = teclado.next();
        System.out.printf("Digite o departamento do funcionário %s: ", funcionario.nome);
        funcionario.departamento = teclado.next();
        System.out.printf("Digite o salário do funcionário %s: ", funcionario.nome);
        funcionario.salario = teclado.nextDouble();
        System.out.printf("O salário atual do funcionário %s é de R$%.2f\n", funcionario.nome, funcionario.salario);
        System.out.printf("Qual o percentual de aumento do salário do funcionário %s?", funcionario.nome);
        double porcentagem = teclado.nextDouble();
        double salarioComAumento = funcionario.salario + (funcionario.salario * (porcentagem / 100));
        System.out.printf("O salário do funcionário %s com aumento de %.2f%% é de R$%.2f\n", funcionario.nome, porcentagem, salarioComAumento);
    }
}