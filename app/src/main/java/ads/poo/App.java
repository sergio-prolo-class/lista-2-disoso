package ads.poo;

import edu.princeton.cs.algs4.Draw;
import javax.swing.JFrame;

public class App {
    private Draw tela;

    public App() {
        tela = new Draw();
        tela.setCanvasSize(1000, 600);
        tela.setXscale(0, 1000);
        tela.setYscale(0, 600);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void desenharGrade() {
        ads.poo.Grade grade = new ads.poo.Grade(tela, 100, 100);
        grade.desenhar();
    }

    public static void main(String[] args) {
        App aplicativo = new App();
        aplicativo.desenharGrade();
    }
}
