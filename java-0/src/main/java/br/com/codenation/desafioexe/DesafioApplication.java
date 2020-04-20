package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {

		List<Integer> fib = new ArrayList<>();

		for(int cont=0; cont < 350;cont++){

			if(cont==0){
				fib.add(0);
			}
			if(cont==1){cd..
				fib.add(1);
			}
			if(cont>1){
				fib.add( fib.get(cont-1) + fib.get(cont-2));
			}
			if(fib.get(cont)> 350){
				break;
			}
		}

		return fib;
	}

	public static Boolean isFibonacci(Integer numero) {
		return  fibonacci().contains(numero);
	}

}