/* TEMA: CONTADORES. Contador mede ocorrências; começa em 0 e aumenta quando encontra o caso desejado. */
public class Contadores { public static void main(String[] args) { int[] numeros={2,3,4,5}; int pares=0; for(int numero:numeros) if(numero%2==0) pares++; System.out.println(pares); } }
