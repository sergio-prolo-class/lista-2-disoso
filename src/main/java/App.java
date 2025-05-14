import edu.princeton.cs.algs4.Draw;

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
    // Criando um objeto App (conforme lista)
        App aplicativo = new App(); 
    // Mostrando a janela criada
        aplicativo.tela.show(); 
    }
}
