/* TEMA: MAIOR E MENOR. Primeiro elemento inicia referências; os seguintes são comparados. */
public class MaiorEMenor { public static void main(String[] args) { int[] valores={5,1,9,3}; int maior=valores[0],menor=valores[0]; for(int v:valores){if(v>maior)maior=v;if(v<menor)menor=v;} System.out.println(maior+" "+menor); } }
