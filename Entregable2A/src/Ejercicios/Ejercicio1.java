package Ejercicios;

public class Ejercicio1 {

	//Ejercicio 1: proporcione una solución recursiva tanto en C como en Java.
	/*. Dado un array bidimensional de nxn números enteros (siendo n una potencia de 2),
decidir si cumple que el valor en la casilla superior izquierda es menor al de la casilla
inferior derecha y cada uno de los cuatro subarrays cumplen la propiedad. */

	
	public static boolean Matriz(int [][] matriz) {
		return MatrizRec(matriz, 0, 0, matriz.length);
	}

	public static boolean MatrizRec(int [][] matriz, int i , int j, int tam) {
boolean res;
		if(tam==1) {
			res = true;
		}else {
			 int CasillaSupIzq = matriz[i][j];
			 int CasillaInfDer = matriz[i +tam-1][j+tam-1];
			 
			 res = CasillaSupIzq<CasillaInfDer &&
					 MatrizRec(matriz, i, j, tam/2) &&
					 MatrizRec(matriz, i+tam/2, j, tam/2) &&
					 MatrizRec(matriz, i, j+tam/2, tam/2)&&
					 MatrizRec(matriz, i+tam/2, j+tam/2, tam/2);
			 
			 
			 
		}
		return res;
	}
}
