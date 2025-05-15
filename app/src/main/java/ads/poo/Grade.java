package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
    private final int x, y;
    //Dimensão de cada celula de grade (conforme lista)
    private final int celula = 40;


    public Grade(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void desenhar(Draw tela) {
        // Desenhando as linhas da grade
        for (int i = 0; i <= 10; i++) {
            // Criando linhas verticais
            tela.line(x + i * celula, y, x + i * celula, y + 10 * celula);
            // Criando linhas verticais horizontais
            tela.line(x, y + i * celula, x + 10 * celula, y + i * celula);
        }


        // Criando os rotulos da grade (conforme lista)
        for (int i = 0; i < 10; i++) {
            tela.text(x + i * celula + celula/2, y - 15, "" + (char)('A' + i));
            tela.text(x - 15, y + i * celula + celula/2, "" + (i + 1));
        }
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public int getCelula() {
        return celula;
    }
}

