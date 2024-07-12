import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        // variaveis da janela
        int quadradoTamanho = 32;
        int linhas = 16;
        int colunas = 16;
        int boardLargura= quadradoTamanho * colunas; 
        int boardAltura =  quadradoTamanho * linhas;

        JFrame frame = new JFrame("Space Invaders");
        frame.setVisible(true);
        frame.setSize(boardAltura, boardLargura);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false); //o usuario nao consegue mudar o tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpaceInvaders spaceInvanders = new SpaceInvaders();
        frame.add(spaceInvanders);
        frame.pack();
        frame.setVisible(true);
    }
}
