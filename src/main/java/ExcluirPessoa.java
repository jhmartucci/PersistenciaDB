import java.util.Scanner;

public class ExcluirPessoa {

    public void excluirPessoa() throws Exception{
        PessoaDao pd = new PessoaDao();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código a ser excluído...: ");
        int codigo = scanner.nextInt();
        Pessoa pessoa = pd.consultaIndividual(codigo);

        pd.excluirPessoa(pessoa);
    }
}
