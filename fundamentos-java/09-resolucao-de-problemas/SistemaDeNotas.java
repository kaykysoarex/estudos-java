/* TEMA: NOTAS. Array + acumulador + maior/menor. */
public class SistemaDeNotas { public static void main(String[] args) { double[] notas={7,8,6,9}; double soma=0,maior=notas[0],menor=notas[0]; for(double n:notas){soma+=n;if(n>maior)maior=n;if(n<menor)menor=n;} System.out.println("Média="+soma/notas.length+", maior="+maior+", menor="+menor); } }
