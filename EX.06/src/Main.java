import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(calcularIdade());
    }
    public  static class Cadastro{
            String nome;
            int dia;
            int mes;
            int ano;
    }
    public static String calcularIdade(){
        Cadastro cadastrar = new Cadastro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        cadastrar.nome = sc.nextLine();
        System.out.println("Digite o dia do aniversário: ");
        cadastrar.dia = sc.nextInt();
        System.out.println("Digite o mês do aniversário: ");
        cadastrar.mes  = sc.nextInt();
        System.out.println("Digite o ano que nasceu: ");
        cadastrar.ano = sc.nextInt();
        LocalDate dataNascimento = LocalDate.of(cadastrar.ano, cadastrar.mes, cadastrar.dia);
        LocalDate dataReferencia = LocalDate.of(2023, 3, 15);
        Period periodo = Period.between(dataNascimento, dataReferencia);
        int idade = periodo.getYears();
        return cadastrar.nome + " tem " + idade + " anos " + "em 15/03/2023";
    }
}
