package Ejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Set;

import us.lsi.common.Comparator2;

public class Ejercicio3 {

	//• Ejercicio 3: proporcione una solución recursiva en Java.
	/*3. Dada una lista ordenada de tipo genérico (List<E> lista), diseñar un algoritmo que
devuelva un conjunto que incluya los elementos de dicha lista que se encuentren en un
rango [a, b) dado (siendo a y b del mismo tipo que los elementos de la lista). Tenga en
cuenta que el método que desarrolle debe incluir un comparador sobre E como parámetro
de entrada.*/
	//       [ == lo coge
	
	
	public static Set<Integer>ListRangoR(List<Integer> ls,boolean cmp,int a, int b) {
		
		return ListaRango(ls,new HashSet<Integer>(), cmp, a, b, 0);
	
	}	

	
	
	public static Set<Integer> ListaRango(List<Integer> ls ,Set<Integer> res, boolean cmp, int a ,int b,int i) {
	cmp = Comparator2.isInClosedInterval(ls.get(i), a, b);


    if(cmp ==true && i<ls.size()-1) {
    res.add(ls.get(i));
	ListaRango(ls,res, cmp, a, b, i+1);
}
    else if(i<ls.size()-1) {
		return ListaRango(ls,res, cmp, a, b, i+1);

		
	}
	
return res;
}}