/* TEMA: SOMA. Um acumulador recebe todos os elementos visitados. */
public class SomaDaMatriz { public static void main(String[] args) { int[][] m={{1,2},{3,4}}; int soma=0; for(int[] linha:m) for(int valor:linha) soma+=valor; System.out.println(soma); } }
