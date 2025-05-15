package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int linhas;
    private int colunas;
    private Draw tela;

    public Grade(Draw tela, int linhas, int colunas) {
        this.tela = tela;
        this.linhas = linhas;
        this.colunas = colunas;
    }

    public void desenhar() {
        int espacoX = 1000 / colunas;
        int espacoY = 600 / linhas;

        for (int i = 0; i <= colunas; i++) {
            int x = i * espacoX;
            tela.line(x, 0, x, 600);
        }

        for (int j = 0; j <= linhas; j++) {
            int y = j * espacoY;
            tela.line(0, y, 1000, y);
        }
    }
}
