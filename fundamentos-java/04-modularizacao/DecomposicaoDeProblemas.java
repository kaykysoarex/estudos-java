/* TEMA: DECOMPOSIÇÃO. Problema grande → ler dados, calcular, verificar e mostrar. Cada método tem uma responsabilidade. */
public class DecomposicaoDeProblemas { public static void main(String[] args) { double media=calcularMedia(8,6); mostrarSituacao(media); }
    static double calcularMedia(double a,double b) { return (a+b)/2; }
    static void mostrarSituacao(double media) { System.out.println(media>=7 ? "Aprovado" : "Reprovado"); }
}
