package Tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import Ejercicios.Ejercicio3;
import us.lsi.common.Comparator2;
import us.lsi.common.Files2;

public class Test3 {

	public static <E> void main(String[] args) {

		List<String> res = Files2.getLines("ficheros/PI2Ej3DatosEntrada.txt");
		int n = 0;
		while (n < res.size()) {

			Integer i = 0;
			String prueba = res.get(n);
			String[] trozos = prueba.split(";");
			String listaNumeros = trozos[0];
			String rango = trozos[1];

			/////////////////////////

			List<Integer> ls = new ArrayList<Integer>();
			String[] trozoIzq = listaNumeros.trim().split(",");

			while (i < trozoIzq.length) {
				ls.add(Integer.parseInt(trozoIzq[i]));
				i++;

			}

			//////////////////////////////////

			String[] trozoDer = rango.trim().split(" ");
			int a = Integer.parseInt(trozoDer[0]);
			int b = Integer.parseInt(trozoDer[1]);

			////////////////////////////////

			int i2 = 0;

			boolean cmp = Comparator2.isInClosedInterval(ls.get(i2), a, b);

			System.out.print("Lista: [" + listaNumeros + "]        ");
			System.out.print("Rango: [" + a + "," + b + ")" + "        ");

			Set<Integer> resultado = Ejercicio3.ListRangoR(ls, cmp, a, b - 1);

			System.out.println("Conjunto: " + resultado.stream().sorted().collect(Collectors.toList()));
			System.out.println();
			System.out.println();

			n++;
		}

	}
}