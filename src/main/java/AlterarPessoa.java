import java.util.Scanner;

public class AlterarPessoa {

    public void alterarPessoa() throws Exception{
        PessoaDao pd = new PessoaDao();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código a ser alterado...: ");
        int codigo = scanner.nextInt();
        Pessoa pessoa = pd.consultaIndividual(codigo);

        System.out.print("Alterar o nome para...: ");
        String nome = scanner.next();
        pessoa.setNomePessoa(nome);

        System.out.print("Alter o E-mail para...: ");
        String email = scanner.next();
        pessoa.setEmail(email);

        pd.alterarPessoa(pessoa);
    }

}
