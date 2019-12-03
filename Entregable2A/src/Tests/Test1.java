package Tests;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = { { 1, 4 }, { 10, 20 } };
		int[][] matriz1 = { { 1, 4, 2, 0 }, { 3, 3, 7, 7 }, { 6, 4, 2, 5 }, { 3, 9, 1, 4 } };
		int[][] matriz2 = { { 10, 4, 2, 0 }, { 3, 3, 7, 7 }, { 6, 4, 2, 5 }, { 3, 9, 1, 4 } };
		int[][] matriz3 = { { 1, 4, 2, 0 }, { 3, 3, 7, 7 }, { 6, 4, 5, 5 }, { 3, 9, 1, 4 } };
	
	System.out.println("Cumple la propiedad: " + Ejercicios.Ejercicio1.Matriz(matriz));
	System.out.println("Cumple la propiedad: " + Ejercicios.Ejercicio1.Matriz(matriz1));
	System.out.println("Cumple la propiedad: " + Ejercicios.Ejercicio1.Matriz(matriz2));
	System.out.println("Cumple la propiedad: " + Ejercicios.Ejercicio1.Matriz(matriz3));

	}

}
