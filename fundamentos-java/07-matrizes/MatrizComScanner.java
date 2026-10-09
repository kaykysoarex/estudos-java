import java.util.Scanner;
/* TEMA: ENTRADA. Cada combinação válida de i e j recebe um valor. */
public class MatrizComScanner { public static void main(String[] args) { Scanner sc=new Scanner(System.in); int[][] matriz=new int[2][2]; for(int i=0;i<2;i++) for(int j=0;j<2;j++) matriz[i][j]=sc.nextInt(); System.out.println(matriz[0][0]); sc.close(); } }
