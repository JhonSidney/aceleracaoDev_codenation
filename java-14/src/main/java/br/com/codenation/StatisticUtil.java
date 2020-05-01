package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		int media=0,soma=0;
		for(int item=0; item< elements.length;item++){
			soma+=elements[item];
		}
		media = soma / elements.length;
		return media;
	}

	public static int mode(int[] elements) {
		int contador=0, moda=0,global = 0;

		for(int item: elements){
			for(int num :elements){
				if(item == num){
					contador++;
				}
			}
			if(contador>global){
				global = contador;
				moda = item;
			}
			contador=0;
		}
		return moda;
	}




	public static int median(int[] elements) {
		Arrays.sort(elements);
		int mediana=0,pos_antesCentro=0, pos_centro=0;
		if((elements.length % 2) ==0){
			pos_antesCentro = elements.length / 2 - 1;
			pos_centro = elements.length/2 ;
			mediana = (elements[pos_antesCentro] + elements[pos_centro])/2;
		}
		if((elements.length % 2) !=0){
			pos_centro = (elements.length ) / 2;
			mediana = elements[pos_centro];
		}
		return mediana;

	}

}