import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        // variaveis da janela
        int tileSize = 32;
        int rows = 16;
        int columns = 16;
        int boardWidth = tileSize * columns; 
        int boardHeight =  tileSize * rows;

        JFrame frame = new JFrame("Space Invaders");
        frame.setVisible(true);
        frame.setSize(boardHeight, boardWidth);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false); //o usuario nao consegue mudar o tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpaceInvanders spaceInvanders = new SpaceInvanders();
        frame.add(spaceInvanders);
        frame.pack();
        frame.setVisible(true);
    }
}
