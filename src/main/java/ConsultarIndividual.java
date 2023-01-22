import java.util.Scanner;

public class ConsultarIndividual {

    public void consultarIdividual() throws Exception{
        PessoaDao pd = new PessoaDao();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo para consulta...: ");
        int codigo = scanner.nextInt();
        Pessoa pessoa = pd.consultaIndividual(codigo);

        System.out.println("Codigo...: " + pessoa.getIdPessoa());
        System.out.println("Nome.....: " + pessoa.getNomePessoa());
        System.out.println("E-mail...: " + pessoa.getEmail());
    }
}
