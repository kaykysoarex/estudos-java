/* TEMA: ÍNDICES. numeros[0] acessa a primeira posição; em tamanho 4, a última é numeros[3].
 * ERRO COMUM: ArrayIndexOutOfBoundsException. Um array de tamanho 5 aceita 0 até 4; numeros[5] é inválido. */
public class AcessandoPosicoes { public static void main(String[] args) { int[] numeros={10,20,30}; System.out.println(numeros[0]); System.out.println(numeros[2]); } }
