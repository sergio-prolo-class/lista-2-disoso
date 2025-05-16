package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class App {
    // Adicionando tela, objeto que vamos usar para desenhar
    private Draw tela;

    public App() {
        tela = new Draw();
        // Dimensao da janela (conforme lista)
        tela.setCanvasSize(1000, 600);
        // Definindo a escala do eixo X da janela (conforme lista)
        tela.setXscale(0, 1000);
        // Definindo a escala do eixo Y da janela (conforme lista)
        tela.setYscale(0, 600);
    }


    public static void main(String[] args) {
        App aplicativo = new App();

        ads.poo.Grade grade = new ads.poo.Grade(100,100);
        ads.poo.Grade gradeB = new ads.poo.Grade(550,100);

        ads.poo.Navio navio = new Navio(0, 0, 4, grade, false);
        navio.desenhar(aplicativo.tela);

        ads.poo.Navio navioB = new Navio(5, 1, 3, grade, true);
        navioB.desenhar(aplicativo.tela);

        ads.poo.Navio navioC = new Navio(3, 2, 5, grade, true);
        navioC.desenhar(aplicativo.tela);

        ads.poo.Navio navioD = new Navio(7, 5, 3, grade, true);
        navioD.desenhar(aplicativo.tela);

        ads.poo.Navio navioE = new Navio(1, 8, 2, grade, false);
        navioE.desenhar(aplicativo.tela);

        grade.desenhar(aplicativo.tela);
        gradeB.desenhar(aplicativo.tela);
        aplicativo.tela.show();

    }


}