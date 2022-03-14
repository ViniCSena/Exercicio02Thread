public class SomaThread extends Thread {

    public SomaThread(int[][] matriz, int linha) {
        this.matriz = matriz;
        this.linha = linha;
    }

    private int[][] matriz;
    private int linha;

    @Override
    public void run() {
        calc(matriz);
    }

    private void calc(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += matriz[linha][i];
        }

        System.out.println("A soma da linha " + linha + " é " + soma);
    }
}
