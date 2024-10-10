import java.awt.*;
import javax.swing.*;
public class UsandoBoxLayout {
    public static void main(String[] args) {
        JFrame janela = new JFrame("BoxLayout");
        janela.setLayout(new BoxLayout(janela.getContentPane(), BoxLayout.PAGE_AXIS) );
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton botao1 = new JButton ("Botão 1");
        JButton botao2 = new JButton ("Botão 2");
        JButton botao3 = new JButton ("Botão 3");
        JButton botao4 = new JButton ("Botão 4");
        JButton botao5 = new JButton ("Botão 5");
        
        janela.add(botao1);
        janela.add(Box.createRigidArea(new Dimension(10,100)) );
        janela.add(botao2);
        janela.add(botao3);
        janela.add(new Box.Filler(new Dimension(10,100),new Dimension(10,150), new Dimension(10,250)) );
        janela.add(botao4);
        janela.add(botao5);
        botao1.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botao3.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        janela.pack();
        
        janela.setVisible(true);
        
    }
}
