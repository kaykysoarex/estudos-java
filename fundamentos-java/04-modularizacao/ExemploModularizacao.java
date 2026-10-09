/* TEMA: EXEMPLO MODULAR. main coordena; os métodos calculam média, situação e mostram resultado. */
public class ExemploModularizacao { public static void main(String[] args) { double media=calcularMedia(8,6); mostrarResultado(media,obterSituacao(media)); }
    static double calcularMedia(double a,double b) { return (a+b)/2; }
    static String obterSituacao(double media) { return media>=7 ? "Aprovado" : "Reprovado"; }
    static void mostrarResultado(double media,String situacao) { System.out.println(situacao+": "+media); }
}
