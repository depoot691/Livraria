package Livraria.dominio;

import Livraria.metodos.Cadastro;
import Livraria.metodos.Livros;

import javax.swing.*;

public class LivrariaPrincipal {
    static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Livros livros = new Livros();
        String loop;
        int conversaoLoop = 0;

        do {
            try {
                livros.livrosDisponiveis();
                String escolha = (String) JOptionPane.showInputDialog("Para fazer o empréstimo do livro, primeiro tem que se cadastrar \nDeseja inserir um cadastro? (Sim/Não)");
                if (escolha.equals("Sim")) {
                    cadastro.cadastroLivraria();
                    loop = (String) JOptionPane.showInputDialog("Deseja inserir outro cadastro? (1 para sim/2 para não)");
                    conversaoLoop = Integer.parseInt(loop);
                } else {
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                }
            } catch (Exception e) {
                System.out.println("Erro ao inserir dados do cadastro: " + e);
            }
        } while (conversaoLoop == 1);
    }
}
