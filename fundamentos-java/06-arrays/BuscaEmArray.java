/* TEMA: BUSCA. boolean registra se o valor foi encontrado. */
public class BuscaEmArray {
    public static void main(String[] args) {
        int[] numeros = { 3, 5, 10 };
        int procurado = 10;
        boolean encontrado = false;
        for (int n : numeros)
            if (n == procurado)
                encontrado = true;
        System.out.println(encontrado);
    }
}
