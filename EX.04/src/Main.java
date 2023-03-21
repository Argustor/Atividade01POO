import java.time.LocalDate;
import java.time.Period;

public class Main {
    
    public static String calcularIdade(){
        Cadastro cadastro = new Cadastro();
        cadastro.nome = "Renato";
        cadastro.dia = 18;
        cadastro.mes = 6;
        cadastro.ano = 2001;
        LocalDate dataNascimento = LocalDate.of(cadastro.ano, cadastro.mes, cadastro.dia);
        LocalDate dataReferencia = LocalDate.of(2023, 3, 15);
        Period periodo = Period.between(dataNascimento, dataReferencia);
        int idade = periodo.getYears();
        return cadastro.nome + ", " + idade + " anos";

    }

    public static void main(String[] args) throws Exception {
       System.out.println(calcularIdade());
    }
}
