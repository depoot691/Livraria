package Livraria.metodos;

abstract public class CadastroPojo {
    private String Nome;
    private String CPF;
    private int Idade;
    private String Endereco;
    private int id;
    private String Livro;

  abstract public void cadastroLivraria();

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLivro() {
        return Livro;
    }

    public void setLivro(String livro) {
        Livro = livro;
    }
}
