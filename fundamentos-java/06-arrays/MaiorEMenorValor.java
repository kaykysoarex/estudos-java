/* TEMA: MAIOR E MENOR. Comece pelo primeiro valor e compare os demais. */
public class MaiorEMenorValor { public static void main(String[] args) { int[] numeros={7,2,9,4}; int maior=numeros[0],menor=numeros[0]; for(int n:numeros) { if(n>maior) maior=n; if(n<menor) menor=n; } System.out.println(maior+" "+menor); } }
