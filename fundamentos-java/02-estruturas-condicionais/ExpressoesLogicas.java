/* TEMA: OPERADORES LÓGICOS. &&: ambas true; ||: ao menos uma true; !: inverte.
 * &&: TT=T, TF=F, FT=F, FF=F. || só é false quando ambas são false. */
public class ExpressoesLogicas { public static void main(String[] args) {
    boolean carteira = true, feriado = false; int idade = 20;
    System.out.println(idade >= 18 && carteira); System.out.println(feriado || carteira); System.out.println(!feriado);
} }
