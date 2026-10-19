import java.sql.PreparedStatement;
import java.sql.Connection;
public class AlunoDAO {
// ... (código da conexão aqui)
public void salvar(Aluno aluno) {
String sql = "INSERT INTO aluno (nome, idade) VALUES (?, ?)";
try {
Connection conexao = conectar();
PreparedStatement comando = conexao.prepareStatement(sql);
// Preenche os dados — as interrogações
comando.setString(1, aluno.nome);
comando.setInt(2, aluno.idade);
// Executa
comando.executeUpdate();
System.out.println(" Aluno cadastrado!");
conexao.close();
} catch (SQLException erro) {
System.out.println(" Erro ao salvar: " + erro.getMessage());
}
}
}