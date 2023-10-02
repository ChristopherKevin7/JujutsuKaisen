import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {
    
    public MainMenu() {
        setTitle("Jujutsu Kaisen");
        setVisible(true);
        setSize(1920, 1080);
        //Cria o Titulo
        JLabel Title = new JLabel("Jujutsu Kaisen");
        Title.setFont(new Font("Arial", Font.ROMAN_BASELINE, 70)); // Define o tamanho e estilo da fonte
        Title.setHorizontalAlignment(SwingConstants.CENTER);

        
        // Cria os botões do menu
        JButton button1 = new JButton("Novo Jogo");
        //button1.setHorizontalAlignment(SwingConstants.CENTER);
        //button1.setBounds(250, 50, 150, 50);
        JButton button2 = new JButton("Carregar Jogo");
        JButton button3 = new JButton("Como Jogar");
        JButton button4 = new JButton("Créditos", null);
        
        // Adiciona os botões ao painel
        JPanel panel = new JPanel(new GridLayout(11, 3));
        
     
        
        add(panel);
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(Title);
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(button1);
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(button2);
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(button3);
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(button4);
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        
        // Adiciona o painel à janela
        getContentPane().add(panel);
        
        // Define o tamanho da janela e a torna visível
        setSize(1920, 1080);
        setVisible(true);

    }
    
    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
