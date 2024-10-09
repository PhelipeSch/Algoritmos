import javax.swing.JOptionPane;

public class UsandoInputDialog {
    public static void main(String[] args) {
        String resposta = JOptionPane.showInputDialog(null, "Digite algo: ", "Pergunta", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("O que foi digitado: "+ resposta + "===");
    }
}
//InputDialog sempre lê em String
//Sempre que o usuário fechar a janela ou cancelar a String retornará null
//Já se ele não digitar e só clicar em ok retornará uma String vazia