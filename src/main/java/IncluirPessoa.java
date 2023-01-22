import java.util.Scanner;

public class IncluirPessoa {

    public void incluirPessoa() throws Exception {
        PessoaDao pd = new PessoaDao();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código...: ");
        int id = scanner.nextInt();
        System.out.print("Digite o nome...: ");
        String nome = scanner.next();
        System.out.print("Digite o E-mail...: ");
        String email = scanner.next();

        Pessoa pessoa = new Pessoa(id, nome, email);
        pd.incluirPessoa(pessoa);
    }
}
