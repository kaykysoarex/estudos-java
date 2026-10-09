/* TEMA: TESTE DE MESA 2x2. i=0,j=0→1; i=0,j=1→2; i=1,j=0→3; i=1,j=1→4.
 * ERRO comum: trocar linha por coluna ou usar índice igual ao tamanho. */
public class ProblemasComMatrizes { public static void main(String[] args) { int[][] m={{1,-2},{3,-4}}; int negativos=0; for(int[] linha:m) for(int valor:linha) if(valor<0) negativos++; System.out.println(negativos); } }
