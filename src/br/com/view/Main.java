package br.com.view;

import br.com.model.Hora;

public class Main {

	public static void main(String[] args)throws InterruptedException {
		
		int cont;
		
		for(cont=0; cont<1; cont++) {
		System.out.println(Hora.horaAtualizada());
		Thread.sleep(1000);
		System.out.println("");
		cont = cont-1;
		}
	}

}
