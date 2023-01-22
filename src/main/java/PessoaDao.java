import java.util.ArrayList;
import java.util.List;


public class PessoaDao extends Dao{

    public void incluirPessoa(Pessoa pessoa) throws Exception{
        String sql = "insert into pessoa values (?,?,?)";
        open();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, pessoa.getIdPessoa());
        preparedStatement.setString(2, pessoa.getNomePessoa());
        preparedStatement.setString(3, pessoa.getEmail());
        preparedStatement.execute();
        close();
    }
    public void alterarPessoa(Pessoa pessoa) throws Exception{
        String sql = "update pessoa set nomepessoa = ?, email = ? where idpessoa = ?";
        open();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, pessoa.getNomePessoa());
        preparedStatement.setString(2, pessoa.getEmail());
        preparedStatement.setInt(3, pessoa.getIdPessoa());
        preparedStatement.execute();
        close();
    }
    public void excluirPessoa(Pessoa pessoa) throws Exception{
        String sql = "delete from pessoa where idpessoa = ?";
        open();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, pessoa.getIdPessoa());
        preparedStatement.execute();
        close();
    }
    public Pessoa consultaIndividual(int cod) throws Exception{
        String sql = "select * from pessoa where idpessoa = ?";
        open();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, cod);
        resultSet = preparedStatement.executeQuery();
        Pessoa pessoa = null;
        if(resultSet.next()){
            pessoa = new Pessoa();
            pessoa.setIdPessoa(resultSet.getInt("idpessoa"));
            pessoa.setNomePessoa(resultSet.getString("nomepessoa"));
            pessoa.setEmail(resultSet.getString("email"));
        }else{
            System.out.println("Registro não encontrado");
        }
        close();
        return pessoa;
    }
    public List<Pessoa> listarPessoasDB(){
        String sql = "select * from pessoa order by idpessoa";
        try {
            open();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            List<Pessoa> pessoaList = new ArrayList<>();
            while (resultSet.next()){
                Pessoa pessoa = new Pessoa();
                pessoa.setIdPessoa(resultSet.getInt("idpessoa"));
                pessoa.setNomePessoa(resultSet.getString("nomepessoa"));
                pessoa.setEmail(resultSet.getString("email"));
                pessoaList.add(pessoa);
            }
            close();
            return pessoaList;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
