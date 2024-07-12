import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SpaceInvaders extends JPanel implements ActionListener, KeyListener {
    class Block {
        int x;
        int y;
        int largura;
        int altura;
        Image img;
        boolean vivo = true; //para os aliens
        boolean usado = false; //para as balas

        Block(int x, int y, int largura, int altura, Image img) {
            this.x = x;
            this.y = y;
            this.largura = largura;
            this.altura = altura;
            this.img = img; 

        }
    }

    //board
    int quadradoTamanho = 32;
    int linhas = 16;
    int colunas = 16;
    int boardLargura = quadradoTamanho * colunas;
    int boardAltura =  quadradoTamanho * linhas;
    
    Image naveImg;
    Image alienImg;
    Image alienCianoImg;
    Image alienRosaImg;
    Image alienAmareloImg;
    ArrayList<Image> alienImgArray;

    // para a nave
    int naveLargura = quadradoTamanho*2;
    int naveAltura = quadradoTamanho;
    int naveX = quadradoTamanho*colunas/2 - quadradoTamanho;
    int naveY = boardAltura - quadradoTamanho*2; 
    int naveVelocidadeX = quadradoTamanho;
    Block nave;


    SpaceInvaders() {
        setPreferredSize(new Dimension(boardLargura, boardAltura));
        setBackground(Color.black);

        //carregar imagens
        naveImg = new ImageIcon(getClass().getResource("./nave.png")).getImage();
        alienImg = new ImageIcon(getClass().getResource("./alien_branco.png")).getImage();
        alienCianoImg = new ImageIcon(getClass().getResource("./alien_ciano.png")).getImage();
        alienRosaImg = new ImageIcon(getClass().getResource("./alien_rosa/png")).getImage();
        alienAmareloImg = new ImageIcon(getClass().getResource("./alien_amarelo.png")).getImage();

        alienImgArray = new ArrayList<Image>();
        alienImgArray.add(alienImg);
        alienImgArray.add(alienCianoImg);
        alienImgArray.add(alienRosaImg);
        alienImgArray.add(alienAmareloImg);

        nave = new Block(naveX, naveY, naveAltura, naveLargura, naveImg);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.drawImage(nave.img, nave.x, nave.y, nave.largura, nave.altura, null);
    }

}
