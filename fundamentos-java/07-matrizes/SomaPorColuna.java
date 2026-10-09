/* TEMA: SOMA POR COLUNA. Fixe a coluna j e percorra cada linha i. */
public class SomaPorColuna { public static void main(String[] args) { int[][] m={{1,2},{3,4}}; for(int j=0;j<m[0].length;j++) { int soma=0; for(int i=0;i<m.length;i++) soma+=m[i][j]; System.out.println(soma); } } }
