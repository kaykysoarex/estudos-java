/* TEMA: MATRIZ. Percorra 3x3 para exibir diagonal e contar negativos. */
public class ProblemaComMatriz { public static void main(String[] args) { int[][] m={{1,-2,3},{4,5,-6},{7,8,9}}; int negativos=0; for(int i=0;i<m.length;i++){System.out.println("Diagonal: "+m[i][i]);for(int j=0;j<m[i].length;j++)if(m[i][j]<0)negativos++;}System.out.println("Negativos: "+negativos); } }
