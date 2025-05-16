
        package ads.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.*;


public class Navio {
    private int x;
    private int y;
    private int tamanho;
    private final Grade grade;
    private boolean vertical;


    public Navio(int x, int y, int tamanho, Grade grade, boolean vertical) {
        this.x = x;
        this.y = y;
        this.tamanho = tamanho;
        this.grade = grade;
        this.vertical = vertical;
    }
    public void desenhar(Draw tela) {
        Color c = Color.pink;
        int tamanhoCelula = grade.getCelula();

        for(int i = 0; i < tamanho; i++){
            int x2;
            int y2;

            if(vertical){
                x2 = x;
                y2 = y + i;
            }else{
                x2 = x + i;
                y2 = y;
            }

            double xfinal = grade.getX() + x2 * tamanhoCelula + tamanhoCelula / 2.0;
            double yfinal = grade.getY() + y2 * tamanhoCelula + tamanhoCelula / 2.0;

            tela.setPenColor(c);

            tela.filledRectangle(xfinal, yfinal, 20, 20);
        }

    }


}