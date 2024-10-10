import javax.swing.*;
import java.awt.FlowLayout;
public class UsandoFLowLayout {
    
    public static void main(String[] args) {
        JFrame janela = new JFrame("FlowLayout");
        janela.setLayout(new FlowLayout() );
        
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton botao1 = new JButton ("Botão 1");
        JButton botao2 = new JButton ("Botão 2");
        JButton botao3 = new JButton ("Botão 3");
        JButton botao4 = new JButton ("Botão 4");
        JButton botao5 = new JButton ("Botão 5");
        
        janela.add(botao1);
        janela.add(botao2);
        janela.add(botao3);
        janela.add(botao4);
        janela.add(botao5);
        
        janela.setVisible(true);
        
    }
}
