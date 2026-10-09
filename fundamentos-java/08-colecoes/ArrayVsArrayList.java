import java.util.*;
/* TEMA: ARRAY VS ARRAYLIST. Array nasce com tamanho; ArrayList pode receber add e remove. */
public class ArrayVsArrayList { public static void main(String[] args) { String[] array=new String[2]; List<String> lista=new ArrayList<>(); lista.add("Ana"); System.out.println(array.length+" / "+lista.size()); } }
