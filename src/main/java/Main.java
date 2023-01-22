import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int opcao;
        PessoaDao pd = new PessoaDao();

        do {
            System.out.println("-------------------------------------------");
            System.out.println("|    1 - Incluir Pessoas                  |");
            System.out.println("|    2 - Alterar Pessoas                  |");
            System.out.println("|    3 - Excluir Pessoas                  |");
            System.out.println("|    4 - Consulta Pessoas Individual      |");
            System.out.println("|    5 - Listar Todos                     |");
            System.out.println("|    9 - Sair                             |");
            System.out.println("-------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Escolha uma opção...: ");
            opcao = scanner.nextInt();
            menu(opcao);

        }while (opcao != 9);
    }
    public static void menu(int opcao) throws Exception{
        switch (opcao){
            case 1:{
                IncluirPessoa ic = new IncluirPessoa();
                ic.incluirPessoa();
                break;
            }
            case 2:{
                AlterarPessoa ap = new AlterarPessoa();
                ap.alterarPessoa();
                break;
            }
            case 3:{
                ExcluirPessoa ep = new ExcluirPessoa();
                ep.excluirPessoa();
                break;
            }
            case 4:{
                ConsultarIndividual ci = new ConsultarIndividual();
                ci.consultarIdividual();
                break;
            }
            case 5:{
                ListarTodos lt = new ListarTodos();
                lt.listarTodos();
                break;
            }
        }
    }
}
