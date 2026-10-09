/* TEMA: LOOPS ANINHADOS. i percorre linhas; j percorre as colunas da linha i. */
public class PercorrendoMatriz { public static void main(String[] args) { int[][] matriz={{1,2},{3,4}}; for(int i=0;i<matriz.length;i++) for(int j=0;j<matriz[i].length;j++) System.out.println("["+i+"]["+j+"]="+matriz[i][j]); } }
