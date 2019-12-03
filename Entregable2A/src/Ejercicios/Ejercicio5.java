package Ejercicios;

import java.util.ArrayList;
import java.util.List;

import us.lsi.common.Files2;

public class Ejercicio5 {

//	public static Integer ej5Rec(List<Integer> ls,Integer area , Integer h, Integer cont) {
//		if(cont<ls.size()) {
//			h = ls.get(cont);
//			Integer areaC = h;
//			Integer contS=cont;
//			Integer contR = cont;
//		
//		}
//		
//	}
//	
//	public static Integer ej5Rec(List<Integer> ls) {
//	return ej5Rec(ls, 0, 0, 0);
//	}
//	
//	public static Integer ej5(List<Integer> ls) {
////		int area = 0;
////		int numero = 0;
////		int cont = 0;
//		while (cont < ls.size()) {
//			numero = ls.get(cont);
//			Integer areacont = numero;
//			Integer contSumar = cont;
//			Integer contRestar = cont;
//			while (contSumar + 1 != ls.size() && ls.get(contSumar + 1) >= numero) {
//				areacont = areacont + numero;
//				contSumar++;
//			}
//			while (contRestar != 0 && ls.get(contRestar - 1) >= numero) {
//				areacont = areacont + numero;
//				contRestar = contRestar - 1;
//			}
//			if (area < areacont) {
//				area = areacont;
//			}
//			cont++;
//
//		}
//		return area;
//
//	}

public static void leeFichero5(String fichero){
	List<Integer> res= new ArrayList<Integer>();
	List<String> lis= Files2.getLines(fichero);
	Integer i=0;
	Integer f=0;
	Integer r=0;
	while(i<lis.size()) {
		if(!lis.get(i).isEmpty()) {
			String [] trozos =lis.get(i).split(",");
			while(f<trozos.length) {
				r= Integer.valueOf(trozos[f].trim());
				res.add(r);
				f++;
			}
		}
		System.out.println("Entrada: " + res);
	//	System.out.println("Salida: "+ Ejercicio5.ej5(res));
		System.out.println("============================");
		res.clear();
		f=0;
		i++;
	}}
}