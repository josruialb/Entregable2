package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ej5 {

	public static Integer Histo(List<Integer> hi) {
		return hRec(hi, 0, 0, 0, new ArrayList<Integer>());
	}

	public static Integer hRec(List<Integer> ls, int area, int i, int h, List<Integer> ele) {

		if (ls.size() == 1) {
			area = ls.get(0);
		} else if(i< ls.size()-1){
			int columnaIzq = ls.get(i);
			int columnaDer = ls.get(i + 1);

			if ((Math.abs(columnaIzq - columnaDer) <= 1)) {
				h = Math.min(columnaIzq, columnaDer);
				ele.add(columnaIzq);
				if((Math.abs(columnaDer - (columnaDer+1)) <= 1))
				ele.add(columnaDer);
				area = ele.size() * h;
				
				area = hRec(ls, area, i + 1, h, ele);
			}else  {
				area =hRec(ls, area, i + 1, h, ele);
			
		}
		
	}
		return area;
}}
