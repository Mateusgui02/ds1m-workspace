package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
	
		Conta contaDaAna = new Conta();
		Conta contaDoJoao = new Conta();
		
		contaDaAna.titular = "Ana Gomes";
		contaDaAna.numero = "111-98";
		contaDaAna.tipo = "Corrente";
		contaDaAna.ativa = true;
		contaDaAna.chequeEspecial = 200;
		contaDaAna.depositar(100);
		contaDaAna.consultarSaldo();
		contaDaAna.depositar(30);
		contaDaAna.consultarSaldo();
		contaDaAna.sacar(50);
		contaDaAna.consultarSaldo();
		contaDaAna.sacar(500);
		contaDaAna.consultarSaldo();
		contaDaAna.sacar(50);
		contaDaAna.consultarSaldo();
		contaDaAna.sacar(80);
		contaDaAna.consultarSaldo();
		contaDaAna.depositar(100);
		contaDaAna.consultarSaldo();
		contaDaAna.getSaldo();
		
		
		int a = somar(10, 5);
	}
	
	public static int somar(int valor1,int valor2) {
		int resultado = valor1 + valor2;
		return resultado;
	}

}
