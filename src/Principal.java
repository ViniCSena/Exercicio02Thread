import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int[][] matrizAleatoria = matrizAleatoria();
        Thread t1 = new SomaThread(matrizAleatoria, 0);
        Thread t2 = new SomaThread(matrizAleatoria, 1);
        Thread t3 = new SomaThread(matrizAleatoria, 2);

        t1.start();
        t2.start();
        t3.start();

    }

    private static int[][] matrizAleatoria() {
        Random random = new Random();

        int[][] matriz = new int[3][5];
        System.out.println("Matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        return matriz;
    }
}
