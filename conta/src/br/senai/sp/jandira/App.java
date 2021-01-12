package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
	
		Conta contaJoćoVitor;
		Conta contaPedro;
		
		contaJoćoVitor = new Conta();
		contaPedro = new Conta();
		
		//*** Conta do Joćo
		contaJoćoVitor.numero = "111-0";
		contaJoćoVitor.titular = "Joćo Vitor Araujo";
		contaJoćoVitor.tipo ="Corente";
		contaJoćoVitor.ativa = true;
		contaJoćoVitor.depositar(100);
		contaJoćoVitor.consultarSaldo();
		contaJoćoVitor.depositar(300);
		contaJoćoVitor.consultarSaldo();
		contaJoćoVitor.depositar(-50);
		contaJoćoVitor.consultarSaldo();
		
		
		//*** Conta Pedro
		contaPedro.numero = "222-0";
		contaPedro.titular = "Pedro";
		contaPedro.tipo ="Poupanēa";
		contaPedro.ativa =true;
		
		
	}

}
