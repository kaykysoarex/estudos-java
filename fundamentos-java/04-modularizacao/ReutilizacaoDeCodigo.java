/* TEMA: REUTILIZAÇÃO. Em vez de repetir a fórmula, chame calcularMedia sempre que precisar dela. */
public class ReutilizacaoDeCodigo { public static void main(String[] args) { System.out.println(calcularMedia(8,7)); System.out.println(calcularMedia(5,9)); }
    static double calcularMedia(double a,double b) { return (a+b)/2; }
}
