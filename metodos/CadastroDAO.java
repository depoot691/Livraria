package Livraria.metodos;

import BDconexao.ConexaoMySQL1;
import investicacaoOSINT.metodos.Alvo;

import java.sql.*;

public class CadastroDAO {

    public Cadastro create(Cadastro cadastro) throws SQLException{
        String sql = "INSERT INTO cadastro (nome,cpf,idade,endereco,livro) VALUES (?, ?, ?, ?, ?)";
        try(Connection conn = ConexaoMySQL1.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getCPF());
            stmt.setInt(3, cadastro.getIdade());
            stmt.setString(4, cadastro.getEndereco());
            stmt.setString(5, cadastro.getLivro());

            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Falha ao criar o cadastro, nenhuma linha afetada.");
            }
            try(ResultSet generateKeys = stmt.getGeneratedKeys()){
                if (generateKeys.next()){
                    cadastro.setId(generateKeys.getInt(1));
                }else {
                    throw new SQLException("Falha ao criar o cadastro, nenhum ID obtido.");
                }
            }

        }
        return cadastro;
    }

    public boolean update(Cadastro cadastro) throws SQLException {
        String sql = "UPDATE alvo SET nome = ?, cpf = ?, idade = ?, endereco = ? WHERE id = ?";
        try (Connection conn = ConexaoMySQL1.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getCPF());
            stmt.setInt(3, cadastro.getIdade());
            stmt.setInt(4, cadastro.getId());
            stmt.setString(5, cadastro.getEndereco());
            stmt.setString(6, cadastro.getLivro());

            return stmt.executeUpdate() > 0;
        }
    }
    }
