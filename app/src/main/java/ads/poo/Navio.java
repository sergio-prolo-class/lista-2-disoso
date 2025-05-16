package ads.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.*;


public class Navio {
    private final int x;
    private final int y;
    private final int tamanho;
    private final Grade grade;
    private final boolean vertical;

    public Navio(int x, int y, int tamanho, Grade grade, boolean vertical) {
        this.x = x;
        this.y = y;
        this.tamanho = tamanho;
        this.grade = grade;
        this.vertical = vertical;
    }

    public void desenhar(Draw tela) {
        int inicioX = grade.getX();
        int inicioY = grade.getY();
        int tamanhoCelula = grade.getCelula();
        tela.setPenColor(Draw.BLUE);

        for (int i = 0; i < tamanho; i++) {
            int xReal = vertical ? inicioX + x * tamanhoCelula : inicioX + (x + i) * tamanhoCelula;
            int yReal = vertical ? inicioY + (y + i) * tamanhoCelula : inicioY + y * tamanhoCelula;
            tela.filledSquare(xReal + tamanhoCelula / 2.0, yReal + tamanhoCelula / 2.0, tamanhoCelula / 2.0);
        }
    }
}
