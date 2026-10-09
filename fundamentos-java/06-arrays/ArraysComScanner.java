import java.util.Scanner;

/* TEMA: ARRAY COM SCANNER. O for usa índices válidos de 0 até length-1 para preencher e mostrar. */
public class ArraysComScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        for (int n : numeros)
            System.out.println(n);
        sc.close();
    }
}
