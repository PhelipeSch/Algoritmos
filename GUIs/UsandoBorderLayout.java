import javax.swing.*;
import java.awt.BorderLayout;
public class UsandoBorderLayout {
    public static void main(String[] args) {
        JFrame janela = new JFrame("BorderLayout");
        janela.setLayout(new BorderLayout() );
        
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton botao1 = new JButton ("Botão 1");
        JButton botao2 = new JButton ("Botão 2");
        JButton botao3 = new JButton ("Botão 3");
        JButton botao4 = new JButton ("Botão 4");
        JButton botao5 = new JButton ("Botão 5");
        
        janela.add(botao1, BorderLayout.NORTH );
        janela.add(botao2, BorderLayout.SOUTH );
        janela.add(botao3, BorderLayout.WEST );
        janela.add(botao4, BorderLayout.EAST );
        janela.add(botao5, BorderLayout.CENTER );
        
        janela.setVisible(true);
        
    }
}
