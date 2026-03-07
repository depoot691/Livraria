package Livraria.metodos;
import javax.swing.JOptionPane;

public class Cadastro extends CadastroPojo{

    @Override
    public void cadastroLivraria(){
        String nome, cpf, endereco, idadeString, livro;
        int idade;
        CadastroDAO novoCadastro = new CadastroDAO();
        Cadastro cadastro = new Cadastro();

        try {
            nome = (String) JOptionPane.showInputDialog("Digite o nome:");
            cpf = (String) JOptionPane.showInputDialog("Digite o CPF:");
            idadeString = JOptionPane.showInputDialog("Digite a idade:");
            idade = Integer.parseInt(idadeString);
            endereco = (String) JOptionPane.showInputDialog("Digite o endereço:");
            livro = (String) JOptionPane.showInputDialog("Digite o nome do livro desejado:");

            cadastro.setNome(nome);
            cadastro.setCPF(cpf);
            cadastro.setIdade(idade);
            cadastro.setEndereco(endereco);
            cadastro.setLivro(livro);

            novoCadastro.create(cadastro);
            System.out.println("Cliente cadastrado com sucesso! ID: " + cadastro.getId());
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar cliente: " + e);
        }

    }
}


