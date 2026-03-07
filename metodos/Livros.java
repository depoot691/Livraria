package Livraria.metodos;
import javax.swing.*;

public class Livros {

    public void livrosDisponiveis(){
        try{
            JOptionPane.showMessageDialog(null, "Bem  vindo á nossa livraria! \nAqui estão os livros disponíveis para empréstimo:", "Livraria", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Livros disponíveis:\n" +     "1. O Alquimista - Paulo Coelho\n" +
                    "2. Dom Casmurro - Machado de Assis\n" +
                    "3. A Menina que Roubava Livros - Markus Zusak\n" +
                    "4. O Pequeno Príncipe - Antoine de Saint-Exupéry\n" +
                    "5. 1984 - George Orwell\n" +
                    "6. O Senhor dos Anéis - J.R.R. Tolkien\n" +
                    "7. O Código Da Vinci - Dan Brown\n" +
                    "8. A Guerra dos Tronos - George R.R. Martin\n" +
                    "9. O Hobbit - J.R.R. Tolkien\n" +
                    "10. O Morro dos Ventos Uivantes - Emily Brontë", "Livros Disponíveis", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Erro ao exibir livros disponíveis: " + e);
        }
    }

}



