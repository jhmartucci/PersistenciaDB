import java.util.List;

public class ListarTodos {
    PessoaDao pd = new PessoaDao();

    public void listarTodos() throws Exception{
        List<Pessoa> pessoas = pd.listarPessoasDB();

        for (Pessoa pessoa : pessoas){
            System.out.println("Codigo...: " + pessoa.getIdPessoa());
            System.out.println("Nome.....: " + pessoa.getNomePessoa());
            System.out.println("E-mail...: " + pessoa.getEmail());
            System.out.println("---------------------------------------");
        }

    }
}
