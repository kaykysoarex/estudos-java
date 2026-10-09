/* TEMA: SOMA POR LINHA. Reinicie soma dentro do loop externo para cada linha. */
public class SomaPorLinha { public static void main(String[] args) { int[][] m={{1,2},{3,4}}; for(int i=0;i<m.length;i++) { int soma=0; for(int j=0;j<m[i].length;j++) soma+=m[i][j]; System.out.println(soma); } } }
